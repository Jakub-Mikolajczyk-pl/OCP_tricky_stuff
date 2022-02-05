package questions;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void inits() {
        LocalDate localDate = LocalDate.now();
        localDate = LocalDate.of(2022, 10, 31);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(9, 45, 00, 00);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 31, 9, 45, 0, 0);
        System.out.println(localDateTime); // T separates date from time!

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 10, 31, 9, 45, 0, 0, ZoneId.of("America/Chicago"));
        System.out.println(zonedDateTime);
    }

    public static void formatDateTimeDefault() {
        LocalDateTime localDateTime = LocalDateTime.now();
//        String dateTimeString = "" +localDateTime.getDayOfWeek() + " " ... The way without DateTimeFormatter
        String dateTimeString = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateTimeString);
    }

    public static void formatDateTimeCustom() {
        LocalDateTime localDateTime = LocalDateTime.now();
        var pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");
        // EEEE day-of-week text, LLLL month-of-year text, dd day-of-month number, yyyy year number
        var dateTimeString = pattern.format(localDateTime);
        // Or var dateTimeString = localDateTime.format(pattern);
        System.out.println(dateTimeString);
    }
}
