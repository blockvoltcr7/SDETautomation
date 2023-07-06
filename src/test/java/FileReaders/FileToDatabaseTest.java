package FileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FileToDatabaseTest {
    public static void main(String[] args) {
        // Step 1: Establish a database connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "username", "password");

            // Step 2: Create a HashSet to store unique IDs from the file
            Set<String> fileUniqueIDs = new HashSet<>();

            // Step 3: Read the file line by line
            try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Step 4: Extract the unique ID from each line
                    String uniqueID = extractUniqueID(line);
                    if (uniqueID != null) {
                        // Step 5: Add the unique ID to the HashSet
                        fileUniqueIDs.add(uniqueID);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Step 6: Query the database to retrieve all unique IDs from the PORT_SCR table
            Set<String> databaseUniqueIDs = new HashSet<>();
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT UNIQUE_ID FROM PORT_SCR")) {
                while (resultSet.next()) {
                    String uniqueID = resultSet.getString("UNIQUE_ID");
                    // Add the unique ID to the database HashSet
                    databaseUniqueIDs.add(uniqueID);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Step 7-9: Compare unique IDs from the database with those from the file
            boolean testPassed = true;
            for (String uniqueID : databaseUniqueIDs) {
                // Step 8: Check if the unique ID exists in the file HashSet
                if (!fileUniqueIDs.contains(uniqueID)) {
                    // Step 9: Log/print the missing unique ID and mark the program as failed
                    System.out.println("Missing unique ID in the file: " + uniqueID);
                    testPassed = false;
                }
            }

            // Step 10-11: Check for missing unique IDs from the file
            if (fileUniqueIDs.size() != databaseUniqueIDs.size()) {
                for (String uniqueID : fileUniqueIDs) {
                    if (!databaseUniqueIDs.contains(uniqueID)) {
                        // Log/print the missing unique ID and mark the program as failed
                        System.out.println("Missing unique ID in the database: " + uniqueID);
                        testPassed = false;
                    }
                }
            }

            // Step 12: Close the database connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // Print the test result
            if (testPassed) {
                System.out.println("Test passed: All file records found in the database.");
            } else {
                System.out.println("Test failed: Some file records not found in the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Utility method to extract the unique ID from each line
    private static String extractUniqueID(String line) {
        // Assuming the unique ID is located between byte indices 10 and 18
        String uniqueID = line.substring(10, 18);

        // Remove any leading or trailing whitespace
        uniqueID = uniqueID.trim();

        // Remove any leading zeros
        uniqueID = uniqueID.replaceFirst("^0+(?!$)", "");

        return uniqueID;
    }
}
