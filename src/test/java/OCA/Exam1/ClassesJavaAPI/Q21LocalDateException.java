package OCA.Exam1.ClassesJavaAPI;

import java.time.LocalDate;

public class Q21LocalDateException {

    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2020, 9, 31);
        System.out.println(date);
    }

    /**
     * The code you provided tries to create a LocalDate object representing a date of September 31st, 2020.
     * However, September only has 30 days, so this is not a valid date according to the calendar system used by Java.
     *
     * When the code tries to create the LocalDate object with an invalid date,
     * it throws a runtime exception called DateTimeException.
     * This exception indicates that the date provided is not a valid date within the calendar system used by Java.
     *
     * To avoid this exception, you should provide a valid date when working with LocalDate.
     * For example, you can use September 30th, 2020, which is a valid date.
     *
     * Explanation
     * LocalDate.of(...) method first validates year, then month and finally day of the month.
     *
     * September can't have 31 days so LocalDate.of(...) method throws an instance of java.time.DateTimeException class.
     */

    /**
     * April (April has 30 days)
     * June (June has 30 days)
     * September (September has 30 days)
     * November (November has 30 days)
     * All other months in the year, namely January, February,
     * March, May, July, August, October, and December, have 31 days
     * (except February, which has 28 or 29 days in a leap year).
     */
}
