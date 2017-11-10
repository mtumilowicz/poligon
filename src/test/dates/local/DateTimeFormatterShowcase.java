package test.dates.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by mtumilowicz on 2017-10-21.
 */
public class DateTimeFormatterShowcase {
    public static void main(String args[]) {

        System.out.println("+------------------------------+");
        System.out.println("LocalDate");
        LocalDate date = LocalDate.of(2015, 4, 10); 

        System.out.println("FULL: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("LONG: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("MEDIUM: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("SHORT: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        System.out.println("+------------------------------+");
        System.out.println("LocalTime");
        LocalTime time = LocalTime.of(17, 22, 19);

        System.out.println("FULL: " + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).withZone(ZoneId.systemDefault())));
        System.out.println("LONG: " + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).withZone(ZoneId.systemDefault())));
        System.out.println("MEDIUM: " + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println("SHORT: " + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));

        System.out.println("+------------------------------+");
        System.out.println("LocalDateTime");
        LocalDateTime dateTime = LocalDateTime.of(2015, 4, 10, 12, 14, 22);
        
        System.out.println("FULL: " + dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.systemDefault())));
        System.out.println("LONG: " + dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withZone(ZoneId.systemDefault())));
        System.out.println("MEDIUM: " + dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println("SHORT: " + dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
    }
}
