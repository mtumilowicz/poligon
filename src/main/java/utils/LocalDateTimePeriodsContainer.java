package utils;

import problems.dates.local.LocalDateTimePeriod;

import java.time.LocalDateTime;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class LocalDateTimePeriodsContainer {
    
    private static LocalDateTime lc_1 = LocalDateTime.of(1, 1, 1, 1, 1);
    private static LocalDateTime lc_2 = LocalDateTime.of(1, 1, 1, 1, 2);
    private static LocalDateTime lc_3 = LocalDateTime.of(1, 1, 1, 1, 3);
    private static LocalDateTime lc_4 = LocalDateTime.of(1, 1, 1, 1, 4);
    private static LocalDateTime lc_5 = LocalDateTime.of(1, 1, 1, 1, 5);
    
    public static LocalDateTimePeriod period_1_2 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_1, lc_2);
    public static LocalDateTimePeriod period_1_3 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_1, lc_3);
    public static LocalDateTimePeriod period_1_4 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_1, lc_4);

    public static LocalDateTimePeriod period_2_3 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_2, lc_3);
    public static LocalDateTimePeriod period_2_4 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_2, lc_4);
    
    public static LocalDateTimePeriod period_3_4 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_3, lc_4);

    public static LocalDateTimePeriod period_4_5 = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_4, lc_5);
    
    public static LocalDateTimePeriod period_1_oo = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_1, null);
    public static LocalDateTimePeriod period_2_oo = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_2, null);
    public static LocalDateTimePeriod period_3_oo = LocalDateTimePeriod.LocalDateTimePeriodFactory.get(lc_3, null);
}
