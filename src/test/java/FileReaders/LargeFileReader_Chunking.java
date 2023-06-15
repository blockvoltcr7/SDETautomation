package FileReaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LargeFileReader_Chunking {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String filePath = "src/test/java/FileReaders/datafile.txt";

        Map<Character, Integer> charCounts = new HashMap<>();
        charCounts.put(' ', 0); // Null character count
        charCounts.put('F', 0); // 'F' character count
        charCounts.put('M', 0); // 'M' character count
        charCounts.put('A', 0); // 'A' character count
        charCounts.put('R', 0); // 'R' character count

        int chunkSize = 8192; // Adjust the chunk size as per your requirements

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            char[] buffer = new char[chunkSize];
            int bytesRead;

            while ((bytesRead = reader.read(buffer, 0, chunkSize)) != -1) {
                processChunk(buffer, bytesRead, charCounts);
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

    private static void processChunk(char[] buffer, int bytesRead, Map<Character, Integer> charCounts) {
        for (int i = 0; i < bytesRead; i++) {
            char character = buffer[i];
//            System.out.println(character);
            if (character == ' ' || character == 'F' || character == 'M' || character == 'A' || character == 'R') {
                charCounts.put(character, charCounts.get(character) + 1);
            }
        }
    }
}
