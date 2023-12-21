package FileUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class LookForLastIndex {

    public static void main(String[] args) {
        String filePath = "src/test/java/FileReaders/datafile.txt";

        long startTime = System.currentTimeMillis();


        Map<Character, Integer> charCounts = new HashMap<>();
        charCounts.put(' ', 0); // Null character count
        charCounts.put('F', 0); // 'F' character count
        charCounts.put('M', 0); // 'M' character count
        charCounts.put('A', 0); // 'A' character count
        charCounts.put('R', 0); // 'R' character count

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            while((line = reader.readLine()) != null){
                if (line != null && line.length() >= 85) {
                    char character = line.charAt(85);
                    // Increment the count for the character
                    charCounts.put(character, charCounts.get(character) + 1);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + "ms");
    }
}
