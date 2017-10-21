package problems.dates;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.CollectionUtils;
import utils.DateUtil;

import java.util.*;

import static problems.dates.DatePeriod.DatePeriodFactory;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodsMerger {
    
    public static void print(ArrayList<DatePeriod> datePeriods) {
        Preconditions.checkArgument(datePeriods != null);
        System.out.println(merge(datePeriods));
    }
    
    public static List<DatePeriod> merge(List<DatePeriod> datePeriods) {
        if (CollectionUtils.isEmpty(datePeriods)) {
            return Collections.emptyList();
        }
        
        Collections.sort(datePeriods);
        DatePeriod first = datePeriods.get(0);
        Date dateFrom = first.getDateFrom();
        Date dateTo = first.getDateTo();

        List<DatePeriod> result = new LinkedList<>();

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
