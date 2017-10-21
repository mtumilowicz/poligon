package problems.dates.local;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by mtumilowicz on 2017-10-21.
 */
public class LocalDateTimeGenerator {
    private static final Long upperBound = Long.parseLong("100000000000");

    public static LocalDateTime generate() {
        LocalDate date = LocalDate.of(RandomUtils.nextInt(2000, 2018),
                RandomUtils.nextInt(1, 12),
                RandomUtils.nextInt(1, 20));
        LocalTime time = LocalTime.of(RandomUtils.nextInt(0, 23),
                RandomUtils.nextInt(0, 59),
                RandomUtils.nextInt(0, 59),
                RandomUtils.nextInt(0, 999999999));
        return LocalDateTime.of(date, time);
    }

    public static LocalDateTime generateAfter(LocalDateTime date) {
        Preconditions.checkArgument(date != null);
        return date.plusDays(RandomUtils.nextLong(1, upperBound));
    }
}