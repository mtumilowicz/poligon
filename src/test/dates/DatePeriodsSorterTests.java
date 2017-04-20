package test.dates;

import org.junit.Test;
import problems.dates.DatePeriodsSorter;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodsSorterTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void sortNullTest() {
        DatePeriodsSorter.sort(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortInReverseOrderNullTest() {
        DatePeriodsSorter.sortInReverseOrder(null);
    }
}
