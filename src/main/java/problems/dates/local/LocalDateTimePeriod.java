package problems.dates.local;

import com.google.common.base.Preconditions;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-10-21.
 */
public class LocalDateTimePeriod implements Comparable<LocalDateTimePeriod> {
    private final LocalDateTime dateFrom;
    private final LocalDateTime dateTo;

    private LocalDateTimePeriod(LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalDateTimePeriod that = (LocalDateTimePeriod) o;
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
    public int compareTo(LocalDateTimePeriod o) {
        return dateFrom.compareTo(o.dateFrom);
    }

    public static final class LocalDateTimePeriodFactory {
        public static LocalDateTimePeriod get(LocalDateTime dateFrom, LocalDateTime dateTo) {
            Preconditions.checkArgument(dateFrom != null);
            Preconditions.checkArgument(dateTo == null || dateFrom.isBefore(dateTo));

            return new LocalDateTimePeriod(dateFrom, dateTo);
        }
    }
}