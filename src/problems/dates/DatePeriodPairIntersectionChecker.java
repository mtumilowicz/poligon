package problems.dates;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodPairIntersectionChecker {
    
    public static boolean isEmptyCorrectOrder(DatePeriod leftPeriod, DatePeriod rightPeriod) {
        Preconditions.checkArgument(leftPeriod != null && rightPeriod != null);
        Preconditions.checkArgument(leftPeriod.getDateFrom() != null && rightPeriod.getDateFrom() != null);
        Preconditions.checkArgument(!leftPeriod.getDateFrom().after(rightPeriod.getDateFrom()));
        return leftPeriod.getDateTo() != null && leftPeriod.getDateTo().before(rightPeriod.getDateFrom());
    }
    
    public static boolean isEmpty(DatePeriod dp1, DatePeriod dp2) {
        Preconditions.checkArgument(dp1 != null && dp2 != null);
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
