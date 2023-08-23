package OCA.Exam3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ISO_Date_time_localDate {


    /**
     * The run time exception is returned is due to the fact that the LocalDate class in the java.time package only represents a date
     * without time information, and the ISO_DATE_TIME formatter is meant for formatting date-time values.
     * @param args
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is :: "+str);
    }
}
