package problems.dates;

import com.google.common.base.Preconditions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodsSorter {
    public static List<DatePeriod> sort(List<DatePeriod> list) {
        Preconditions.checkArgument(list != null);
        return list.stream().sorted().collect(Collectors.toList());
    }
    
    public static List<DatePeriod> sortInReverseOrder(List<DatePeriod> list) {
        Preconditions.checkArgument(list != null);
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
