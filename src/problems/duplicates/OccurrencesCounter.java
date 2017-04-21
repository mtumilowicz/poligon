package problems.duplicates;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class OccurrencesCounter<E> {
    public static <E> Map<E, Long> count(List<E> list) {
        Preconditions.checkArgument(list != null);
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
