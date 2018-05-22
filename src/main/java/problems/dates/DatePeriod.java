package problems.dates;

import com.google.common.base.Preconditions;

import java.util.Date;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriod implements Comparable<DatePeriod> {
    private final Date dateFrom;
    private final Date dateTo;

    private DatePeriod(Date dateFrom, Date dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Date getDateFrom() {
        return new Date(dateFrom.getTime());
    }

    public Date getDateTo() {
        return dateTo != null ? new Date(dateTo.getTime()) : null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatePeriod that = (DatePeriod) o;
        return Objects.equals(dateFrom, that.dateFrom) &&
                Objects.equals(dateTo, that.dateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateFrom, dateTo);
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                '}';
    }

    @Override
    public int compareTo(DatePeriod o) {
        return dateFrom.compareTo(o.dateFrom);
    }
    
    public static final class DatePeriodFactory {
        public static DatePeriod get(Date dateFrom, Date dateTo) {
            Preconditions.checkArgument(dateFrom != null);
            Preconditions.checkArgument(dateTo == null || dateFrom.before(dateTo));
            
            Date dateFromCopy = new Date(dateFrom.getTime());
            Date dateToCopy = dateTo != null ? new Date(dateTo.getTime()) : null;
            
            return new DatePeriod(dateFromCopy, dateToCopy);
        }
    }
}
