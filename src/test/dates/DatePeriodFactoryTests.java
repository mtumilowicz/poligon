package test.dates;

import org.junit.Test;

import java.util.Date;

import static problems.dates.DatePeriod.DatePeriodFactory;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodFactoryTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        DatePeriodFactory.get(null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullTest2() {
        DatePeriodFactory.get(null, null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void dateFromAfterDateTo() {
        DatePeriodFactory.get(new Date(2), new Date(1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void dateFromEqualsDateTo() {
        DatePeriodFactory.get(new Date(1), new Date(1));
    }
}
