package DataFormatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting1 {

    public static void main(String[] args) {
        //create date format in YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //create date object
        LocalDate date = LocalDate.now();
        //format date
        String formattedDate = date.format(formatter);
        //print date
        System.out.println("Today is " + formattedDate);

    }





}
