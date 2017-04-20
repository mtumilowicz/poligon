package utils;

import problems.dates.DatePeriod;

import java.util.Date;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodsCreatedContainer {
    
    public static DatePeriod notNullDatePeriod = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod leftPeriod = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod rightPeriod = DatePeriod.DatePeriodFactory.get(new Date(3), new Date(4));

    public static DatePeriod leftDp1 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod rightDp1 = DatePeriod.DatePeriodFactory.get(new Date(3), new Date(4));

    public static DatePeriod leftDp2 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod rightDp2 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(3));

    public static DatePeriod leftDp3 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(3));
    public static DatePeriod rightDp3 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(4));

    public static DatePeriod leftDp4 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(3));
    public static DatePeriod rightDp4 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(4));

    public static DatePeriod leftDp5 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(3));
    public static DatePeriod rightDp5 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(3));

    public static DatePeriod leftDp6 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(4));
    public static DatePeriod rightDp6 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(3));

    public static DatePeriod leftDp7 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(4));
    public static DatePeriod rightDp7 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(3));

    public static DatePeriod leftDp8 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(4));
    public static DatePeriod rightDp8 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(4));

    public static DatePeriod leftDp9 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod rightDp9 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));

    //    private DatePeriod leftDp1 = DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod rightDp1NullDateTo = DatePeriod.DatePeriodFactory.get(new Date(3), null);

    //    private DatePeriod leftDp2 = DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod rightDp2NullDateTo = DatePeriod.DatePeriodFactory.get(new Date(2), null);

    //    private DatePeriod leftDp3 = DatePeriodFactory.get(new Date(1), new Date(3));
    public static DatePeriod rightDp3NullDateTo = DatePeriod.DatePeriodFactory.get(new Date(2), null);

    //    private DatePeriod leftDp4 = DatePeriodFactory.get(new Date(1), new Date(3));
    public static DatePeriod rightDp4NullDateTo = DatePeriod.DatePeriodFactory.get(new Date(1), null);

    public static DatePeriod leftDp3NullDateTo = DatePeriod.DatePeriodFactory.get(new Date(1), null);
    //    private DatePeriod rightDp3 = DatePeriodFactory.get(new Date(2), new Date(4));

    public static DatePeriod leftDp4NullDateTo = DatePeriod.DatePeriodFactory.get(new Date(1), null);
    //    private DatePeriod rightDp4 = DatePeriodFactory.get(new Date(1), new Date(4));
}
