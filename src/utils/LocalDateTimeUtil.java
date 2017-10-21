package utils;

import java.time.LocalDateTime;

/**
 * Created by mtumilowicz on 2017-10-21.
 */
public class LocalDateTimeUtil {

    public static LocalDateTime max(LocalDateTime date1, LocalDateTime date2) {
        if (date1 == null || date2 == null) {
            return null;
        }
        return date1.isAfter(date2) ? date1 : date2;
    }
}
