package utils;

import problems.dates.DatePeriod;

import java.util.Date;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodsContainer {
    
    public static DatePeriod period_1_2 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(2));
    public static DatePeriod period_1_3 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(3));
    public static DatePeriod period_1_4 = DatePeriod.DatePeriodFactory.get(new Date(1), new Date(4));

    public static DatePeriod period_2_3 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(3));
    public static DatePeriod period_2_4 = DatePeriod.DatePeriodFactory.get(new Date(2), new Date(4));
    
    public static DatePeriod period_3_4 = DatePeriod.DatePeriodFactory.get(new Date(3), new Date(4));

    public static DatePeriod period_4_5 = DatePeriod.DatePeriodFactory.get(new Date(4), new Date(5));
    
    public static DatePeriod period_1_oo = DatePeriod.DatePeriodFactory.get(new Date(1), null);
    public static DatePeriod period_2_oo = DatePeriod.DatePeriodFactory.get(new Date(2), null);
    public static DatePeriod period_3_oo = DatePeriod.DatePeriodFactory.get(new Date(3), null);
}
