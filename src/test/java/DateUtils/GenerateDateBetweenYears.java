package DateUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateDateBetweenYears {

    public static String generateRandomDate(int startYear) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        // Generate a random year, month, and day
        int year = ThreadLocalRandom.current().nextInt(startYear, currentYear + 1);
        int month = ThreadLocalRandom.current().nextInt(1, 13);
        LocalDate date = LocalDate.of(year, month, 1);
        int day = ThreadLocalRandom.current().nextInt(1, date.lengthOfMonth() + 1);

        // Create the random date
        LocalDate randomDate = LocalDate.of(year, month, day);

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return randomDate.format(formatter);
    }

    public static void main(String[] args) {
        String date = generateRandomDate(2009);
        System.out.println(date);
        //convert the date to format of yyyy-MM-dd
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        //remove the - from the localdate
        String dateWithoutDash = localDate.toString().replace("-", "");
        System.out.println(dateWithoutDash);

        System.out.println("EPAM DIAL :: "+generateRandomDate());



    }


    public static String generateRandomDate() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        Calendar today = Calendar.getInstance();
        Calendar startOf2009 = Calendar.getInstance();
        startOf2009.set(2009, 0, 1);

        long randomMillis = getRandomMillis(startOf2009.getTimeInMillis(), today.getTimeInMillis());

        Date randomDate = new Date(randomMillis);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        return sdf.format(randomDate);
    }
    private static long getRandomMillis(long lowerBound, long upperBound) {
        Random r = new Random();
        long randomValue = lowerBound + (long)(r.nextDouble()*(upperBound - lowerBound));
        return randomValue;
    }

}
