package test.dates;

import org.junit.Test;
import problems.dates.DatePeriod;
import problems.dates.DatePeriodGenerator;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodGeneratorTests {
    
    @Test
    public void testZeroNotNull() {
        ArrayList<DatePeriod> datePeriods = DatePeriodGenerator.generateArrayList(0);
        assertTrue(datePeriods != null);
    }
    
    @Test
    public void testZeroEmpty() {
        ArrayList<DatePeriod> datePeriods = DatePeriodGenerator.generateArrayList(0);
        assertTrue(datePeriods.size() == 0);
    }
}
