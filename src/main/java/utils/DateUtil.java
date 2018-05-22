package utils;

import java.util.Date;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DateUtil {
    public static Date max(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return null;
        }
        return date1.after(date2) ? date1 : date2;
    }
}
