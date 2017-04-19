package problems.dates;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class EveryPairOfDatePeriodHasEmptyIntersection {
    public static boolean check(List<DatePeriod> datePeriods) {
        return IntStream.range(0, datePeriods.size()-1).allMatch(i -> DatePeriodPairIntersectionChecker.isEmpty(datePeriods.get(i),datePeriods.get(i+1)));
    }
}
