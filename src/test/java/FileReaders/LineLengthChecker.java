package FileReaders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class LineLengthChecker {
    public static void main(String[] args) {
        Optional<String> invalidLine = findInvalidLine("src/test/java/FileReaders/datafile.txt", 86);
        if (invalidLine.isPresent()) {
            System.out.println("Line with unexpected length: " + invalidLine.get());
        } else {
            System.out.println("All lines are 86 bytes long.");
        }
    }

    public static Optional<String> findInvalidLine(String filePath, int expectedLength) {
        try {
            return Files.lines(Paths.get(filePath))
                    .filter(line -> line.length() != expectedLength)
                    .findFirst();
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
