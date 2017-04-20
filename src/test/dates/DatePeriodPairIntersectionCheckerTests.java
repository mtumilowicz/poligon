package test.dates;

import org.junit.Test;
import problems.dates.DatePeriod;
import problems.dates.DatePeriodPairIntersectionChecker;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static problems.dates.DatePeriod.DatePeriodFactory;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodPairIntersectionCheckerTests {
    
    private DatePeriod notNullDatePeriod = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod leftPeriod = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightPeriod = DatePeriodFactory.get(new Date(3), new Date(4));
    
    private DatePeriod leftDp1 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDp1 = DatePeriodFactory.get(new Date(3), new Date(4));

    private DatePeriod leftDp2 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDp2 = DatePeriodFactory.get(new Date(2), new Date(3));

    private DatePeriod leftDp3 = DatePeriodFactory.get(new Date(1), new Date(3));
    private DatePeriod rightDp3 = DatePeriodFactory.get(new Date(2), new Date(4));

    private DatePeriod leftDp4 = DatePeriodFactory.get(new Date(1), new Date(3));
    private DatePeriod rightDp4 = DatePeriodFactory.get(new Date(1), new Date(4));

    private DatePeriod leftDp5 = DatePeriodFactory.get(new Date(1), new Date(3));
    private DatePeriod rightDp5 = DatePeriodFactory.get(new Date(2), new Date(3));

    private DatePeriod leftDp6 = DatePeriodFactory.get(new Date(1), new Date(4));
    private DatePeriod rightDp6 = DatePeriodFactory.get(new Date(2), new Date(3));

    private DatePeriod leftDp7 = DatePeriodFactory.get(new Date(1), new Date(4));
    private DatePeriod rightDp7 = DatePeriodFactory.get(new Date(1), new Date(3));

    private DatePeriod leftDp8 = DatePeriodFactory.get(new Date(1), new Date(4));
    private DatePeriod rightDp8 = DatePeriodFactory.get(new Date(2), new Date(4));

    private DatePeriod leftDp9 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDp9 = DatePeriodFactory.get(new Date(1), new Date(2));

//    private DatePeriod leftDp1 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDp1NullDateTo = DatePeriodFactory.get(new Date(3), null);

//    private DatePeriod leftDp2 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDp2NullDateTo = DatePeriodFactory.get(new Date(2), null);

//    private DatePeriod leftDp3 = DatePeriodFactory.get(new Date(1), new Date(3));
    private DatePeriod rightDp3NullDateTo = DatePeriodFactory.get(new Date(2), null);

//    private DatePeriod leftDp4 = DatePeriodFactory.get(new Date(1), new Date(3));
    private DatePeriod rightDp4NullDateTo = DatePeriodFactory.get(new Date(1), null);

    private DatePeriod leftDp3NullDateTo = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp3 = DatePeriodFactory.get(new Date(2), new Date(4));

    private DatePeriod leftDp4NullDateTo = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp4 = DatePeriodFactory.get(new Date(1), new Date(4));
    
    // null notnull
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyCorrectOrderLeftPeriodNullTest() {
        DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(null, notNullDatePeriod);
    }

    // notnull null
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyCorrectOrderRightPeriodNullTest() {
        DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(notNullDatePeriod, null);
    }

    // incorrect order
    @Test(expected = IllegalArgumentException.class)
    public void isEmptyIncorrectOrderNotNullTest() {
        DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(rightPeriod, leftPeriod);
    }
    
    // samePeriod samePeriod
    @Test
    public void isEmptyCorrectOrderSameDatesNotNullTest() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftPeriod, leftPeriod));
    }
    
    // [ ] [ ]
    @Test
    public void isEmptyCorrectOrderFirstDateToBeforeSecondDateFrom() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp1, rightDp1));
    }

    // [ ][ ]
    @Test
    public void isEmptyCorrectOrderFirstDateToEqualsSecondDateFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp2, rightDp2));
    }

    // [L [P L] P]
    @Test
    public void isEmptyCorrectOrderSecondDateFromBeforeNotNullFirstDateToBeforeNotNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp3, rightDp3));
    }

    // [L[P L] P]
    @Test
    public void isEmptyCorrectOrderSecondDateFromEqualsFirstDateFromNotNullFirstDateToBeforeNotNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp4, rightDp4));
    }

    // [L [P L]P]
    @Test
    public void isEmptyCorrectOrderSecondDateFromAfterFirstDateFromFirstDateToEqualsSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp5, rightDp5));
    }

    // [L [P P] L]
    @Test
    public void isEmptyCorrectOrderSecondInsideFirst() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp6, rightDp6));
    }

    // [L[P P] L]
    @Test
    public void isEmptyCorrectOrderSecondInsideFirstAndFirstDateFromEqualsSecondDateFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp7, rightDp7));
    }

    // [L [P P]L]
    @Test
    public void isEmptyCorrectOrderSecondInsideFirstAndFirstDateToEqualsSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp8, rightDp8));
    }

    // [[ ]]
    @Test
    public void isEmptyCorrectOrderEqualsPeriods() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp9, rightDp9));
    }

    // [ ] [ ...
    @Test
    public void isEmptyCorrectOrderFirstDateToBeforeSecondDateFromSecondDateToNull() {
        assertTrue(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp1, rightDp1NullDateTo));
    }

    // [ ][ ...
    @Test
    public void isEmptyCorrectOrderFirstDateToEqualsSecondDateFromSecondDateToNull() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp2, rightDp2NullDateTo));
    }

    // [L [P L] P...
    @Test
    public void isEmptyCorrectOrderSecondDateFromBeforeNotNullFirstDateToBeforeNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp3, rightDp3NullDateTo));
    }

    // [L[P L] P...
    @Test
    public void isEmptyCorrectOrderSecondDateFromEqualsFirstDateFromNotNullFirstDateToBeforeNullSecondDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp4, rightDp4NullDateTo));
    }

    // [L [P P] L...
    @Test
    public void isEmptyInsideFirstAndNullFirstDateTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp3NullDateTo, rightDp3));
    }

    // [L[P P] L...
    @Test
    public void isEmptyInsideFirstAndNullFirstDateToAndFirstDateFromEqualsSecondDateFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp4NullDateTo, rightDp4));
    }

    // [L [P P] L...
    @Test
    public void isEmptyInsideFirstAndNullDatesTo() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp3NullDateTo, rightDp3NullDateTo));
    }

    // [L[P P] L...
    @Test
    public void isEmptyInsideFirstAndNullDatesToAndEqualsDatesFrom() {
        assertFalse(DatePeriodPairIntersectionChecker.isEmptyCorrectOrder(leftDp4NullDateTo, rightDp4NullDateTo));
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
