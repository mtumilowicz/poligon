package problems.dates;

import utils.DateUtil;

import java.util.ArrayList;
import java.util.Date;

import static problems.dates.DatePeriod.DatePeriodFactory;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodsMerger {
    
    public static void print(ArrayList<DatePeriod> datePeriods) {
        System.out.println(merge(datePeriods));
    }
    
    public static ArrayList<DatePeriod> merge(ArrayList<DatePeriod> datePeriods) {
        DatePeriod first = datePeriods.get(0);
        Date dateFrom = first.getDateFrom();
        Date dateTo = first.getDateTo();

        ArrayList<DatePeriod> result = new ArrayList<>();

        for (int i = 1; i < datePeriods.size(); i++) {
            DatePeriod current = datePeriods.get(i);
            if (dateTo == null || !current.getDateFrom().after(dateTo)) {
                dateTo = DateUtil.max(current.getDateTo(), dateTo);
            } else {
                result.add(DatePeriodFactory.get(dateFrom, dateTo));
                dateFrom = current.getDateFrom();
                dateTo = current.getDateTo();
            }

        }

        result.add(DatePeriodFactory.get(dateFrom, dateTo));

        return result;

    }
}
