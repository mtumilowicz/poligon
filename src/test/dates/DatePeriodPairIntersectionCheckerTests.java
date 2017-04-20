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

    private DatePeriod leftDpNullDateTo1 = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp1 = DatePeriodFactory.get(new Date(3), new Date(4));

    private DatePeriod leftDpNullDateTo2 = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp2 = DatePeriodFactory.get(new Date(2), new Date(3));

    private DatePeriod leftDpNullDateTo3 = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp3 = DatePeriodFactory.get(new Date(2), new Date(4));

    private DatePeriod leftDpNullDateTo4 = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp4 = DatePeriodFactory.get(new Date(2), new Date(3));

    private DatePeriod leftDpNullDateTo5 = DatePeriodFactory.get(new Date(1), null);
//    private DatePeriod rightDp5 = DatePeriodFactory.get(new Date(1), new Date(1));

//    private DatePeriod leftDp1 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDpNullDateTo1 = DatePeriodFactory.get(new Date(3), null);

//    private DatePeriod leftDp2 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDpNullDateTo2 = DatePeriodFactory.get(new Date(2), null);

//    private DatePeriod leftDp3 = DatePeriodFactory.get(new Date(1), new Date(3));
    private DatePeriod rightDpNullDateTo3 = DatePeriodFactory.get(new Date(2), null);

//    private DatePeriod leftDp4 = DatePeriodFactory.get(new Date(1), new Date(4));
    private DatePeriod rightDpNullDateTo4 = DatePeriodFactory.get(new Date(2), null);

//    private DatePeriod leftDp5 = DatePeriodFactory.get(new Date(1), new Date(2));
    private DatePeriod rightDpNullDateTo5 = DatePeriodFactory.get(new Date(1), null);

    private DatePeriod leftDpNullDateTo1_ = DatePeriodFactory.get(new Date(1), null);
    private DatePeriod rightDpNullDateTo1_ = DatePeriodFactory.get(new Date(3), null);

    private DatePeriod leftDpNullDateTo2_ = DatePeriodFactory.get(new Date(1), null);
    private DatePeriod rightDpNullDateTo2_ = DatePeriodFactory.get(new Date(2), null);

    private DatePeriod leftDpNullDateTo3_ = DatePeriodFactory.get(new Date(1), null);
    private DatePeriod rightDpNullDateTo3_ = DatePeriodFactory.get(new Date(2), null);

    private DatePeriod leftDpNullDateTo4_ = DatePeriodFactory.get(new Date(1), null);
    private DatePeriod rightDpNullDateTo4_ = DatePeriodFactory.get(new Date(2), null);

    private DatePeriod leftDpNullDateTo5_ = DatePeriodFactory.get(new Date(1), null);
    private DatePeriod rightDpNullDateTo5_ = DatePeriodFactory.get(new Date(1), null);
    
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
