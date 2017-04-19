package test.dates;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import problems.dates.DatePeriod.DatePeriodFactory;
import problems.dates.DatePeriodPairIntersectionChecker;
import utils.Period;

import java.util.Date;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodPairIntersectionCheckerTests {
    
    @Test
    public void correctOrderNotNullDatesToNotEmptyIntersection() {
        for (int i = 0; i < 30; i++) {
            long number = RandomUtils.nextLong();
            assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(number), new Date(number + 50000)), DatePeriodFactory.get(new Date(number + 10000), new Date(number + 40000))));
        }
    }

    @Test
    public void correctOrderNullDatesToNotEmptyIntersection() {
        for (int i = 0; i < 30; i++) {
            Period<Long> longPeriod = Period.PeriodsFactory.get(RandomUtils.nextLong(), RandomUtils.nextLong());
            assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(longPeriod.getFirst()), null), DatePeriodFactory.get(new Date(longPeriod.getSecond()), null)));
        }
    }
    
    @Test
    public void correctOrderNullFirstDateToNotEmptyIntersection() {
        for (int i = 0; i < 30; i++) {
            long number = RandomUtils.nextLong();
            assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(number), null), DatePeriodFactory.get(new Date(number + 10000), new Date(50000))));

        }
    }
    @Test
    public void correctOrderNullSecondDateToNotEmptyIntersection() {
        for (int i = 0; i < 30; i++) {
            long number = RandomUtils.nextLong();
            assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(number), new Date(number + 50000)), DatePeriodFactory.get(new Date(number+10000), null)));
        }
    }

    @Test
    public void reverseOrderNotNullDatesToNotEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(10000), new Date(40000)), DatePeriodFactory.get(new Date(1), new Date(50000))));
    }

    @Test
    public void reverseOrderNullDatesToNotEmptyIntersection1() {
        assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(10000), null), DatePeriodFactory.get(new Date(1), null)));
    }

    @Test
    public void reverseOrderNullSecondDateToNotEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(10000), new Date(50000)), DatePeriodFactory.get(new Date(1), null)));
    }

    @Test
    public void reverseOrderNullFirstDateToNotEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isNotEmpty(DatePeriodFactory.get(new Date(10000), null), DatePeriodFactory.get(new Date(1), new Date(50000))));
    }

    @Test
    public void correctOrderNotNullDatesToEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(DatePeriodFactory.get(new Date(1), new Date(50000)), DatePeriodFactory.get(new Date(60000), new Date(70000))));
    }

    @Test
    public void correctOrderNullSecondDateToEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(DatePeriodFactory.get(new Date(1), new Date(50000)), DatePeriodFactory.get(new Date(60000), null)));
    }

    @Test
    public void reverseOrderNotNullDatesToEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(DatePeriodFactory.get(new Date(10000), new Date(40000)), DatePeriodFactory.get(new Date(1), new Date(9000))));
    }

    @Test
    public void reverseOrderNullSecondDateToEmptyIntersection() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(DatePeriodFactory.get(new Date(10000), new Date(50000)), DatePeriodFactory.get(new Date(60000), null)));
    }

}
