package problems.dates;

import com.google.common.base.Preconditions;

import java.util.Date;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class DatePeriod implements Comparable<DatePeriod> {
    private Date dateFrom;
    private Date dateTo;

    private DatePeriod(Date dateFrom, Date dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatePeriod that = (DatePeriod) o;

        return (dateFrom != null ? dateFrom.equals(that.dateFrom) : that.dateFrom == null) && (dateTo != null ? dateTo.equals(that.dateTo) : that.dateTo == null);
    }

    @Override
    public int hashCode() {
        int result = dateFrom != null ? dateFrom.hashCode() : 0;
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        return result;
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
            
            return new DatePeriod(dateFrom, dateTo);
        }
    }
}
