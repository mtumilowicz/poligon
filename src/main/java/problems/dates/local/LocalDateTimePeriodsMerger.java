package problems.dates.local;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.CollectionUtils;
import utils.LocalDateTimeUtil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-10-21.
 */
public class LocalDateTimePeriodsMerger {
    public static void print(ArrayList<LocalDateTimePeriod> datePeriods) {
        Preconditions.checkArgument(datePeriods != null);
        System.out.println(merge(datePeriods));
    }

    public static List<LocalDateTimePeriod> merge(List<LocalDateTimePeriod> datePeriods) {
        if (CollectionUtils.isEmpty(datePeriods)) {
            return Collections.emptyList();
        }

        Collections.sort(datePeriods);
        LocalDateTimePeriod first = datePeriods.get(0);
        LocalDateTime dateFrom = first.getDateFrom();
        LocalDateTime dateTo = first.getDateTo();

        List<LocalDateTimePeriod> result = new LinkedList<>();

        for (int i = 1; i < datePeriods.size(); i++) {
            LocalDateTimePeriod current = datePeriods.get(i);
            if (dateTo == null || !current.getDateFrom().isAfter(dateTo)) {
                dateTo = LocalDateTimeUtil.max(current.getDateTo(), dateTo);
            } else {
                result.add(LocalDateTimePeriod.LocalDateTimePeriodFactory.get(dateFrom, dateTo));
                dateFrom = current.getDateFrom();
                dateTo = current.getDateTo();
            }
        }

        result.add(LocalDateTimePeriod.LocalDateTimePeriodFactory.get(dateFrom, dateTo));

        return result;

    }
}
