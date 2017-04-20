package test.dates;

import org.junit.Test;
import problems.dates.DatePeriodPairIntersectionChecker;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static problems.dates.DatePeriod.DatePeriodFactory;
import static utils.DatePeriodsCreatedContainer.*;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodPairIntersectionCheckerTests {
    
    // null notnull
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyCorrectOrderLeftPeriodNullTest() {
        DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(null, period_1_2);
    }

    // notnull null
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyCorrectOrderRightPeriodNullTest() {
        DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, null);
    }

    // incorrect order
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyIncorrectOrderNotNullTest() {
        DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_3_4, period_1_2);
    }
    
    // samePeriod samePeriod
    @Test
    public void isEmptyCorrectOrderSameDatesNotNullTest() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, period_1_2));
    }
    
    // [ ] [ ]
    @Test
    public void isEmptyCorrectOrderFirstDateToBeforeSecondDateFrom() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, period_3_4));
    }

    // [ ][ ]
    @Test
    public void isEmptyCorrectOrderFirstDateToEqualsSecondDateFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, period_2_3));
    }

    // [L [P L] P]
    @Test
    public void isEmptyCorrectOrderSecondDateFromBeforeNotNullFirstDateToBeforeNotNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_3, period_2_4));
    }

    // [L[P L] P]
    @Test
    public void isEmptyCorrectOrderSecondDateFromEqualsFirstDateFromNotNullFirstDateToBeforeNotNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_3, period_1_4));
    }

    // [L [P L]P]
    @Test
    public void isEmptyCorrectOrderSecondDateFromAfterFirstDateFromFirstDateToEqualsSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_3, period_2_3));
    }

    // [L [P P] L]
    @Test
    public void isEmptyCorrectOrderSecondInsideFirst() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_4, period_2_3));
    }

    // [L[P P] L]
    @Test
    public void isEmptyCorrectOrderSecondInsideFirstAndFirstDateFromEqualsSecondDateFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_4, period_1_3));
    }

    // [L [P P]L]
    @Test
    public void isEmptyCorrectOrderSecondInsideFirstAndFirstDateToEqualsSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_4, period_2_4));
    }

    // [[ ]]
    @Test
    public void isEmptyCorrectOrderEqualsPeriods() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, period_1_2));
    }

    // [ ] [ ...
    @Test
    public void isEmptyCorrectOrderFirstDateToBeforeSecondDateFromSecondDateToNull() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, period_3_oo));
    }

    // [ ][ ...
    @Test
    public void isEmptyCorrectOrderFirstDateToEqualsSecondDateFromSecondDateToNull() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_2, period_2_oo));
    }

    // [L [P L] P...
    @Test
    public void isEmptyCorrectOrderSecondDateFromBeforeNotNullFirstDateToBeforeNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_3, period_2_oo));
    }

    // [L[P L] P...
    @Test
    public void isEmptyCorrectOrderSecondDateFromEqualsFirstDateFromNotNullFirstDateToBeforeNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_3, period_1_oo));
    }

    // [L [P P] L...
    @Test
    public void isEmptyInsideFirstAndNullFirstDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_oo, period_2_4));
    }

    // [L[P P] L...
    @Test
    public void isEmptyInsideFirstAndNullFirstDateToAndFirstDateFromEqualsSecondDateFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_oo, period_1_4));
    }

    // [L [P P] L...
    @Test
    public void isEmptyInsideFirstAndNullDatesTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_oo, period_2_oo));
    }

    // [L[P P] L...
    @Test
    public void isEmptyInsideFirstAndNullDatesToAndEqualsDatesFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(period_1_oo, period_1_oo));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyNullTest() {
        DatePeriodPairIntersectionChecker.isEmpty(null, null);
    }
    
    @Test
    public void isEmptyFirstDateToBeforeSecondDateTo() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmpty(
                DatePeriodFactory.get(new Date(1), new Date(2)), 
                DatePeriodFactory.get(new Date(3), new Date(4))));
    }
}
