package problems.intervals;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-10-14.
 */
public class IntervalsMerger {
    public static List<Interval> merge(List<Interval> intervals) {
        if (CollectionUtils.isEmpty(intervals)) {
            return Collections.emptyList();
        }
        Collections.sort(intervals);
        Interval first = intervals.get(0);
        int start = first.getStart();
        int end = first.getEnd();

        List<Interval> result = new LinkedList<>();

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.getStart() <= end) {
                end = Integer.max(current.getEnd(), end);
            } else {
                result.add(new Interval(start, end));
                start = current.getStart();
                end = current.getEnd();
            }
        }

        result.add(new Interval(start, end));

        return result;
    }
}
