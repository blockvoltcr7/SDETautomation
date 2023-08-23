package OCA.LocalDatePractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalTimeExamples {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        p(now);

        LocalTime lunchTime = LocalTime.of(12, 30);
        p(lunchTime);

        LocalTime bedtime = LocalTime.of(23, 15, 55, 333);
        p(bedtime);

        LocalTime wakeup = bedtime.plusHours(8);
        p(wakeup);

        wakeup = wakeup.plusMinutes(15);
        p(wakeup);

        LocalDateTime timeHired = LocalDateTime.of(2008, 4, 1, 9, 0);
        p(timeHired);

        LocalDate hiredDate = LocalDate.of(2008, 4, 1);
        LocalDate nowDate = LocalDate.now();
        Period period = Period.between(hiredDate,nowDate);
        p(period);




    }


    public static void p(Object o) {
        System.out.println(o);
    }
}
