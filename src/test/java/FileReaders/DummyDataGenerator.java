package FileReaders;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DummyDataGenerator {

    public static void main(String[] args) {
        String filePath = "src/test/java/FileReaders/datafile.txt";
        int lineCount = 50;
        int lineLength = 86;

        try (FileWriter writer = new FileWriter(filePath)) {
            Random random = new Random();
            String characters = "FAMR ";

            for (int i = 0; i < lineCount; i++) {
                StringBuilder line = new StringBuilder(lineLength - 1);
                for (int j = 0; j < lineLength - 1; j++) {

                    //generate random numbers


                    line.append(random.nextInt(10)); // Append random numbers
                }
                line.append(randomChar(random, characters)); // Append random character
                line.append('\n');
                writer.write(line.toString());
            }

            System.out.println("Dummy data generated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static char randomChar(Random random, String characters) {
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
}