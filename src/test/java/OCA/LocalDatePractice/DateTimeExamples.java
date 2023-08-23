package OCA.LocalDatePractice;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExamples {


    public static void main(String[] args) {

//        LocalDate now = LocalDate() there is no public constructor for LocalDate
        LocalDate now = LocalDate.now();
        p(now);
        LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 1);
        p(hireDate);

        //how do we change a date
        LocalDate aWeekFromNow = now.plusWeeks(1);
        p(aWeekFromNow);

        LocalDate aWeekAgo = now.minusWeeks(1);
        p(aWeekAgo);




    }

    public static void p(Object o){
        System.out.println(o);
    }
}
