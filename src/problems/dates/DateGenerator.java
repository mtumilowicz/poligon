package problems.dates;

import org.apache.commons.lang3.RandomUtils;

import java.util.Date;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DateGenerator {
    
    private static final Long upperBound = Long.parseLong("100000000000");
    
    public static Date generate() {
        long currentTimeMillis = System.currentTimeMillis();
        long random = RandomUtils.nextLong(1, upperBound);
        
        return new Date(Math.abs(RandomUtils.nextBoolean() ? 
                currentTimeMillis - random : currentTimeMillis + random));
    }

    public static Date generateAfter(Date date) {
        return new Date(Math.abs(date.getTime() + RandomUtils.nextInt() + 1));
    }
}
