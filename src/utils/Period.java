package utils;

/**
 * Created by mtumilowicz on 2017-04-19.
 */
public class Period<K extends Comparable<K>> {
    private K first;
    private K second;

    private Period(K first, K second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Period<?> period = (Period<?>) o;

        return (first != null ? first.equals(period.first) : period.first == null) && (second != null ? second.equals(period.second) : period.second == null);
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
    
    public static class PeriodsFactory {
        public static <K extends Comparable<K>> Period<K> get(K first, K second) {
            if (first.compareTo(second) > 0) {
                K temp = first;
                first = second;
                second = temp;
            }
            return new Period<>(first, second);
        }
    }
}
