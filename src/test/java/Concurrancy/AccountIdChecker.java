package Concurrancy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AccountIdChecker {

    public static void main(String[] args) {
        String filePath = "account_ids.txt"; // Path to your account IDs file
        int batchSize = 1000; // Adjust batch size as needed
        String dbConnectionString = "jdbc:oracle:thin:@your-db-host:1521:your-sid";
        String dbUser = "your-db-username";
        String dbPassword = "your-db-password";

        Set<String> missingAccounts = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ExecutorService executor = Executors.newFixedThreadPool(4); // Adjust thread pool size as needed

            while ((line = reader.readLine()) != null) {
                String accountId = line.trim();

                executor.submit(() -> {
                    try (Connection connection = DriverManager.getConnection(dbConnectionString, dbUser, dbPassword)) {
                        String sqlQuery = "SELECT COUNT(*) FROM account_table WHERE account_id = ?";
                        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
                            preparedStatement.setString(1, accountId);
                            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                                resultSet.next();
                                int count = resultSet.getInt(1);
                                if (count == 0) {
                                    missingAccounts.add(accountId); // Account is missing, add it to the Set
                                }
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });
            }

            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        // At this point, missingAccounts Set contains all missing account IDs
        // You can further process or use this Set as needed
    }
}
