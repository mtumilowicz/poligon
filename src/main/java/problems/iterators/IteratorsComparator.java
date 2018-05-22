package problems.iterators;

import com.google.common.base.Preconditions;

import java.util.Iterator;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-05-17.
 */
public class IteratorsComparator {
    public static <T, V> boolean equals(Iterable<T> first, Iterable<V> second) {
        Preconditions.checkArgument(first != null);
        Preconditions.checkArgument(second != null);
        
        Iterator<T> firstIterator = first.iterator();
        Objects.requireNonNull(firstIterator);
        
        Iterator<V> secondIterator = second.iterator();
        Objects.requireNonNull(secondIterator);
        
        while(firstIterator.hasNext()) {
            if (!secondIterator.hasNext() || !Objects.equals(firstIterator.next(), secondIterator.next())) {
                return false;
            }
        }
        return !secondIterator.hasNext();
    }
}
