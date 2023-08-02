package OCA.LocalDatePractice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterExamples {


    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        p(now);

//        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
// this will throw an exception with no compile errors
//        p(dtf.format(now));

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        p(dtf.format(now));
        dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        p(dtf.format(now));
        dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        p(dtf.format(now));


//        DateTimeFormatter newPattern = new DateTimeFormatter("MMMM dd, yyyy"); //this will not compile, there is no public constructor for DateTimeFormatter
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        p(pattern.format(now));
        pattern = DateTimeFormatter.ofPattern("MM dd, yyyy");
        p(pattern.format(now));

        pattern = DateTimeFormatter.ofPattern("MMM 'in the year of' yyyy");
        p(pattern.format(now));
        pattern = DateTimeFormatter.ofPattern("dd 'in the year of' yyyy");
        p(pattern.format(now));

        LocalTime time = LocalTime.now();
        p(time.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
    }


    public static void p(Object o) {
        System.out.println(o);
    }

}
