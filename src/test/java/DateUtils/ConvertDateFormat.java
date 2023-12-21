package DateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertDateFormat {

    public static String convertToYYYYMMDD(String date) {
        // Define the input and output formats
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input date string to a LocalDate object
        LocalDate localDate = LocalDate.parse(date, inputFormatter);

        // Format the LocalDate object to the desired output string format
        return localDate.format(outputFormatter);
    }

    public static void main(String[] args) {
        String inputDate = "12-15-2023";
        String convertedDate = convertToYYYYMMDD(inputDate);
        System.out.println(convertedDate); // Outputs the date in yyyy-MM-dd format
    }
}
