package problems.dates;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Date;

import static problems.dates.DatePeriod.DatePeriodFactory;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriodGenerator {
    
    public static DatePeriod generate() {
        Date dateFrom;
        return DatePeriodFactory.get(dateFrom = DateGenerator.generate(), RandomUtils.nextBoolean() ? null : DateGenerator.generateAfter(dateFrom));
    }

    public static ArrayList<DatePeriod> generateArrayList(int howMany) {
        ArrayList<DatePeriod> datePeriods = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            datePeriods.add(generate());
        }
        return datePeriods;
    }
    
    public static ArrayList<DatePeriod> generateSorted(int howMany) {
        return DatePeriodsSorter.sort(generateArrayList(howMany));
    }
}
