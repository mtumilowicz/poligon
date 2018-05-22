package problems.dates;

import org.junit.Test;
import problems.dates.DatePeriodPairIntersectionChecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.DatePeriodsContainer.*;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodPairIntersectionCheckerTests {

    @Test(expected = IllegalArgumentException.class)
    public void isEmpty_null_null() {
        DatePeriodPairIntersectionChecker.isEmpty(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isEmpty_null_period_1_2() {
        DatePeriodPairIntersectionChecker.isEmpty(null, period_1_2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isEmpty_period_1_2_null() {
        DatePeriodPairIntersectionChecker.isEmpty(period_1_2, null);
    }
    
    // [ ] [ ]
    @Test
    public void isEmpty_period_1_2_period_3_4() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(period_1_2, period_3_4));
    }

    // [ ][ ]
    @Test
    public void isEmpty_period_1_2_period_2_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_2, period_2_3));
    }

    //[[]]
    @Test
    public void isEmpty_period_1_2_period_1_2() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_2, period_1_2));
    }

    // [L[P L] P]
    @Test
    public void isEmpty_period_1_3_period_1_4() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_3, period_1_4));
    }

    // [L [P L] P]
    @Test
    public void isEmpty_period_1_3_period_2_4() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_3, period_2_4));
    }

    // [L [P L]P]
    @Test
    public void isEmpty_period_1_3_period_2_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_3, period_2_3));
    }

    // [L[P P] L]
    @Test
    public void isEmpty_period_1_4_period_1_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_4, period_1_3));
    }

    // [L [P P] L]
    @Test
    public void isEmpty_period_1_4_period_2_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_4, period_2_3));
    }

    // [L [P P]L]
    @Test
    public void isEmpty_period_1_4_period_2_4() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_4, period_2_4));
    }

    // [ ] [ ...
    @Test
    public void isEmpty_period_1_2_period_3_oo() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(period_1_2, period_3_oo));
    }

    // [ ][ ...
    @Test
    public void isEmpty_period_1_2_period_2_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_2, period_2_oo));
    }

    // [L [P L] P...
    @Test
    public void isEmpty_period_1_3_period_2_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_3, period_2_oo));
    }

    // [L[P L] P...
    @Test
    public void isEmpty_period_1_3_period_1_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_3, period_1_oo));
    }

    // [L [P P] L...
    @Test
    public void isEmpty_period_1_oo_period_2_4() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_oo, period_2_4));
    }

    // [L[P P] L...
    @Test
    public void isEmpty_period_1_oo_period_1_4() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_oo, period_1_4));
    }

    // [L [P P... L...
    @Test
    public void isEmpty_period_1_oo_period_2_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_oo, period_2_oo));
    }

    // [L[P P... L...
    @Test
    public void isEmpty_period_1_oo_period_1_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_oo, period_1_oo));
    }

    /**
     * SAME TEST LIKE ABOVE BUT ARGUMENTS ARE SWAPPED
     */
    
    @Test
    public void isEmpty_period_3_4_period_1_2() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(period_3_4, period_1_2));
    }
    
    @Test
    public void isEmpty_period_2_3_period_1_2() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_3, period_1_2));
    }
    
    @Test
    public void isEmpty_period_2_4_period_1_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_4, period_1_3));
    }
    
    @Test
    public void isEmpty_period_2_3_period_1_4() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_3, period_1_4));
    }
    
    @Test
    public void isEmpty_period_3_oo_period_1_2() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(period_3_oo, period_1_2));
    }
    
    @Test
    public void isEmpty_period_2_oo_period_1_2() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_oo, period_1_2));
    }
    
    @Test
    public void isEmpty_period_2_oo_period_1_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_oo, period_1_3));
    }
    
    @Test
    public void isEmpty_period_1_oo_period_1_3() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_oo, period_1_3));
    }
    
    @Test
    public void isEmpty_period_2_4_period_1_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_4, period_1_oo));
    }
    
    @Test
    public void isEmpty_period_1_4_period_1_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_1_4, period_1_oo));
    }
    
    @Test
    public void isEmpty_period_2_oo_period_1_oo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmpty(period_2_oo, period_1_oo));
    }
}
