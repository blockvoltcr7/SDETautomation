package FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileDataCreator {


    public static void main(String[] args) throws IOException {

    createFile("src/test/java/FileReaders/data_file2.txt", 100, 86);

    }


    //create a file writer to write to a file, format: 4 chars then under score and 4 number sequence with 100 lines
    public static void createFile(String filePath, int lineCount, int lineLength) throws IOException {

        FileWriter writer = new FileWriter(filePath);
        Random random = new Random();
        String characters = "FAMR_";
        String line = null;

        //loop through 100,000 times
        for (int i = 0; i < 25000; i++) {

            line = characters+random.nextInt(40000);
            writer.write(line);
            writer.write("\n");

        }



        //write line to file
        writer.flush();
        writer.close();




    }

}
