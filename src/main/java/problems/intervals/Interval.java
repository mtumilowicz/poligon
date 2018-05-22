package problems.intervals;

import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-10-14.
 */
public class Interval implements Comparable<Interval> {
    private int start;
    private int end;
    
    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Interval o) {
        return Integer.compare(start, o.start);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return start == interval.start &&
                end == interval.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
