package problems.iterators;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

/**
 * Created by mtumilowicz on 2017-04-17.
 */
public class IterablesMerger {
    
    public static <T> Iterable<T> merge(Iterable<? extends T>... inputs) {
        Preconditions.checkArgument(inputs != null);
        return Iterables.concat(inputs);
    }

    public static <T> void printElements(Iterable<? extends T>... inputs) {
        Preconditions.checkArgument(inputs != null);
        merge(inputs).forEach(System.out::println);
    }
}
