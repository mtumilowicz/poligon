package problems.dates;

import org.apache.commons.lang3.RandomUtils;

import java.util.Date;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DateGenerator {
    public static Date generate() {
        return new Date(Math.abs(System.currentTimeMillis() - RandomUtils.nextInt()));
    }

    public static Date generateAfter(Date date) {
        return new Date(Math.abs(date.getTime() + RandomUtils.nextInt() + 1));
    }
}
