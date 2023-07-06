package FileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargeFileReaderChunked2 {



    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();

        Map<Character, Integer> charCounts = new HashMap<>();
        charCounts.put(' ', 0); // Null character count
        charCounts.put('F', 0); // 'F' character count
        charCounts.put('M', 0); // 'M' character count
        charCounts.put('A', 0); // 'A' character count
        charCounts.put('R', 0); // 'R' character count

        String filePath = "src/test/java/FileReaders/datafile.txt";

        int chunkSize = 8192; // Adjust the chunk size as per your requirements

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            char[] buffer = new char[chunkSize];
            int bytesRead;

            while ((bytesRead = reader.read(buffer, 0, chunkSize)) != -1) {
                processChunk(buffer, bytesRead,charCounts);
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

    private static void processChunk(char[] buffer, int bytesRead,Map<Character, Integer> charCounts) {
        StringBuilder lineBuilder = new StringBuilder();



        for (int i = 0; i < bytesRead; i++) {
            char character = buffer[i];

            // Get the bytes of the character
            byte[] characterBytes = String.valueOf(character).getBytes();

            // Check if it's the last index of a line
            if (character == '\n' || i == bytesRead - 1) {
                // Get the last character of the line
                char lastCharacter = lineBuilder.charAt(lineBuilder.length() - 1);
                if (lastCharacter == ' ' || lastCharacter == 'F' || lastCharacter == 'M' || lastCharacter == 'A' || lastCharacter == 'R') {
                    charCounts.put(lastCharacter, charCounts.get(lastCharacter) + 1);
                }

                // Print the last character and its bytes
//                byte[] lastCharacterBytes = String.valueOf(lastCharacter).getBytes();
//                System.out.println("Last Character: " + lastCharacter + ", Bytes: " + Arrays.toString(lastCharacterBytes));

                // Reset the line builder for the next line
                lineBuilder.setLength(0);
            } else {
                // Append the character to the line builder
                lineBuilder.append(character);
            }

            // Print the character in bytes
//            System.out.println("Character: " + character + ", Bytes: " + Arrays.toString(characterBytes));
        }
    }
}
