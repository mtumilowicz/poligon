package problems.dates;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodPairIntersectionChecker {
    
    private static boolean isEmptyCorrectOrder(DatePeriod leftPeriod, DatePeriod rightPeriod) {
        return leftPeriod.getDateTo() != null && !leftPeriod.getDateTo().after(rightPeriod.getDateFrom());
    }
    
    public static boolean isEmpty(DatePeriod dp1, DatePeriod dp2) {
        boolean isEmpty;
        if (dp1.getDateFrom().before(dp2.getDateFrom())) {
            isEmpty = isEmptyCorrectOrder(dp1, dp2);
        } else {
            isEmpty = isEmptyCorrectOrder(dp2, dp1);
        }
        
        return isEmpty;
    }

    public static boolean isNotEmpty(DatePeriod dp1, DatePeriod dp2) {
        return !isEmpty(dp1, dp2);
    }
}
