package problems.duplicates;

import org.apache.commons.collections4.ListUtils;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class OccurrencesCounter<E> {
    public static <E> Map<E, Long> count(List<E> list) {
        return ListUtils.emptyIfNull(list).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
