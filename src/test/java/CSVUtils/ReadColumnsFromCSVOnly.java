package CSVUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadColumnsFromCSVOnly {


    public static List<String> getColumnNames(String filePath) {
        List<String> columnNames = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line != null) {
                // Split the first line (header) to get the column names
                String[] headers = line.split(",");
                for (String header : headers) {
                    columnNames.add(header.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return columnNames;
    }

    public static void main(String[] args) {
        String filePath = "src/test/java/CSVUtils/testCsvFile1.csv"; // Replace with your CSV file path
        List<String> columnNames = getColumnNames(filePath);
        System.out.println("Column Names: " + columnNames);
    }
}


