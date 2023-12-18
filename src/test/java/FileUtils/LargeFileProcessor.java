package FileUtils;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeFileProcessor {

    private static final long CHUNK_SIZE = 1024 * 1024; // 1 MB

    public static void main(String[] args) {
        String filePath = "src/test/java/FileReaders/datafile.txt";
        char[] targetChars = {'F', 'A', 'M', 'R', ' '};

        try (RandomAccessFile file = new RandomAccessFile(filePath, "r");
             FileChannel channel = file.getChannel()) {
            long fileSize = channel.size();
            long position = fileSize - 1; // Start at the last position

            int n = 0;
            System.out.println("position: " + position);
            while (position >= 0) {
                long bufferSize = Math.min(CHUNK_SIZE, position + 1);
                MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, position - bufferSize + 1, bufferSize);

                for (int i = (int) (bufferSize - 1); i >= 0; i--) {
                    char c = (char) buffer.get(i);
                    if (isTargetChar(c, targetChars)) {
                        System.out.println("Found target character '" + c + "' at index " + (position - bufferSize + 1 + i));
                        return; // Uncomment this line if you want to exit after finding the first occurrence
                    }
                }

                position -= bufferSize;
                n++;
            }

            System.out.println("Processed " + n + " chunks.");
            System.out.println("No target character found at the last index of the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isTargetChar(char c, char[] targetChars) {
        for (char targetChar : targetChars) {
            if (c == targetChar) {
                return true;
            }
        }
        return false;
    }

}
