package test.dates.local;

import org.junit.Test;

import java.time.LocalDateTime;

import static problems.dates.local.LocalDateTimePeriod.LocalDateTimePeriodFactory;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class LocalDateTimePeriodFactoryTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        LocalDateTimePeriodFactory.get(null, LocalDateTime.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullTest2() {
        LocalDateTimePeriodFactory.get(null, null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void dateFromAfterDateTo() {
        LocalDateTime test = LocalDateTime.of(1,1,1,1,1);
        LocalDateTimePeriodFactory.get(test.plusDays(1), test);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void dateFromEqualsDateTo() {
        LocalDateTime test = LocalDateTime.of(1,1,1,1,1);
        LocalDateTimePeriodFactory.get(test, test);
    }
}
