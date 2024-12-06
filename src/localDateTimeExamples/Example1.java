package localDateTimeExamples;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime is an immutable date-time object that represents a date-time,
 */
public class Example1 {
    public static void main(String[] args) {
        /// Obtains the current date-time from the system clock in the default time-zone.
        LocalDateTime dateTime = LocalDateTime.now();

        /// Print the date-time
        System.out.println(dateTime);

        ///  Get Year Number
        int year = dateTime.getYear();
        System.out.println("Current Year : " + year);

        /// Get Month Number
        int month = dateTime.getMonthValue();
        System.out.println("Current Month : " + month);

        /// Get the day of the month
        int dayOfMonth =  dateTime.getDayOfMonth();
        System.out.println("Day of month : " + dayOfMonth);


        System.out.println("Working With Time Components : ");
        /// Get the hour value
        int hour = dateTime.getHour();
        System.out.println("Hour : " + hour);

        ///  Get the minute value
        int minutes = dateTime.getMinute();
        System.out.println("Minutes : " + minutes);

        ///  Get the second value
        int seconds = dateTime.getSecond();
        System.out.println("Seconds : " + seconds);

        ///  Get the Nano Second Value
        int nano = dateTime.getNano();
        System.out.println("Nano Seconds : " + nano);

        ///  Date Time Formatters
        System.out.println("Working With Time Formatters : ");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        ///  Printing new formatted date
        String formattedDate = dateTime.format(format);
        System.out.println("Formatted Date : " + formattedDate);

        /// Creating Custom LocalDateTime Objects
        LocalDateTime anotherSummerDay = LocalDateTime.of(2019, 6, 21, 0, 0, 0, 0);
        System.out.println(anotherSummerDay);

        /// Working With Time Components
        int year1 = anotherSummerDay.getYear();
        System.out.println("Year : " + year1);

        int month1 = anotherSummerDay.getMonthValue();
        System.out.println("Month : " + month1);

        int dayOfMonth1 =  anotherSummerDay.getDayOfMonth();
        System.out.println("Day of Month : " + dayOfMonth1);

        int hour1 = anotherSummerDay.getHour();
        System.out.println("Hour : " + hour1);

        int minutes1 = anotherSummerDay.getMinute();
        System.out.println("Minutes : " + minutes1);

        int seconds1 = anotherSummerDay.getSecond();
        System.out.println("Seconds : " + seconds1);

        int nano1 = anotherSummerDay.getNano();
        System.out.println("Nano Seconds : " + nano1);

        String formattedDate1 = anotherSummerDay.format(format);
        System.out.println("Formatted Date : " + formattedDate1);
    }
}
