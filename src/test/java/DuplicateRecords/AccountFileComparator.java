package DuplicateRecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AccountFileComparator {
    public static void main(String[] args) {
        String filePath1 = "src/test/java/DuplicateRecords/accountids.txt";
        String filePath2 = "src/test/java/DuplicateRecords/accountids2.txt";

        Set<String> file1AccountSet = new HashSet<>();
        Set<String> file2AccountSet = new HashSet<>();

        try {
            // Read and populate the first file's accountSet
            BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
            String line;
            while ((line = reader1.readLine()) != null) {
                file1AccountSet.add(line.trim()); // Assuming each line is an account ID
            }
            reader1.close();

            // Read and populate the second file's accountSet
            BufferedReader reader2 = new BufferedReader(new FileReader(filePath2));
            while ((line = reader2.readLine()) != null) {
                file2AccountSet.add(line.trim());
            }
            reader2.close();

            // Find missing account IDs
            Set<String> missingInFile2 = new HashSet<>(file1AccountSet);
            missingInFile2.removeAll(file2AccountSet);

            Set<String> missingInFile1 = new HashSet<>(file2AccountSet);
            missingInFile1.removeAll(file1AccountSet);

            // Print the results
            System.out.println("Accounts missing in the second file:");
            for (String account : missingInFile2) {
                System.out.println(account);
            }

            System.out.println("Accounts missing in the first file:");
            for (String account : missingInFile1) {
                System.out.println(account);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
