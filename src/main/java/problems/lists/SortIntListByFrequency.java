package problems.lists;

import org.apache.commons.collections4.ListUtils;
import problems.duplicates.IntegerOccurrencesCounter;
import problems.maps.MapSorter;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class SortIntListByFrequency {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> sortedByFrequency = new LinkedList<>();

        MapSorter.sortByValueWithReversedOrder(IntegerOccurrencesCounter.count(ListUtils.emptyIfNull(list)))
                .forEach((key, value) -> sortedByFrequency.addAll(Collections.nCopies(value.intValue(), key)));

        return sortedByFrequency;
    }
}
