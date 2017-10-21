package problems.dates.local;

import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-10-21.
 */
public class LocalDateTimePeriodGenerator {

    public static LocalDateTimePeriod generate() {
        LocalDateTime dateFrom;
        return LocalDateTimePeriod.LocalDateTimePeriodFactory.get(dateFrom = LocalDateTimeGenerator.generate(),
                RandomUtils.nextBoolean() ? null : LocalDateTimeGenerator.generateAfter(dateFrom));
    }

    public static List<LocalDateTimePeriod> generate(int howMany) {
        List<LocalDateTimePeriod> datePeriods = new LinkedList<>();
        for (int i = 0; i < howMany; i++) {
            datePeriods.add(generate());
        }
        return datePeriods;
    }
}
