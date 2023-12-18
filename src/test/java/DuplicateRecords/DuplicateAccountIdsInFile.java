package DuplicateRecords;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DuplicateAccountIdsInFile {
    public static void main(String[] args) {
        String filePath = "/Users/samisabir-idrissi/code/java/SDETautomation/src/test/java/DuplicateRecords/accountids.txt"; // Replace with the path to your text file

        Set<String> duplicateAccountIds = findDuplicateAccountIds(filePath);

        // Print duplicate account IDs
        if (!duplicateAccountIds.isEmpty()) {
            System.out.println("Duplicate Account IDs:");
            for (String accountId : duplicateAccountIds) {
                System.out.println(accountId);
            }
        } else {
            System.out.println("No duplicate account IDs found.");
        }
    }

    public static Set<String> findDuplicateAccountIds(String filePath) {
        Set<String> duplicateAccountIds = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Set<String> accountSet = new HashSet<>();

            while ((line = reader.readLine()) != null) {
                // Extract the account ID from position 0 to 7
                String accountId = line.substring(0, 7);

                // Check for duplicate account IDs
                if (!accountSet.add(accountId)) {
                    duplicateAccountIds.add(accountId);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return duplicateAccountIds;
    }

    public static void writeAccountIdsToFile(String filePath, Set<Integer> accountIds) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Use Java Streams to write account IDs to the file
            accountIds.stream().forEach(accountId -> {
                try {
                    writer.write(accountId);
                    writer.newLine(); // Add a newline character to separate accounts on different lines
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            System.out.println("Duplicate Account IDs written to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
