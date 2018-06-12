package problems.lists;

import org.apache.commons.collections4.ListUtils;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mtumilowicz on 2018-06-12.
 */
public class AllContinuousSublists {
    public static <E> Stream<List<E>> firstSolution(List<E> list) {
        List<E> safeList = ListUtils.emptyIfNull(list);
        return Stream.concat(Stream.of(Collections.emptyList()),
                prefixes(safeList).flatMap(AllContinuousSublists::suffixes));
    }
    
    public static <E> Stream<List<E>> secondSolution(List<E> list) {
        List<E> safeList = ListUtils.emptyIfNull(list);

        Stream<List<E>> sublists = IntStream.range(0, safeList.size())
                .mapToObj(start ->
                        IntStream.rangeClosed(start + 1, safeList.size())
                                .mapToObj(end -> safeList.subList(start, end)))
                .flatMap(Function.identity());
        Stream<List<E>> emptyList = Stream.of(Collections.emptyList());
        

        return Stream.concat(emptyList, sublists);
    }
    
    private static <E> Stream<List<E>> prefixes(List<E> list) {
        List<E> safeList = ListUtils.emptyIfNull(list);
        return IntStream.rangeClosed(1, safeList.size())
                .mapToObj(end -> safeList.subList(0, end));
    }

    private static <E> Stream<List<E>> suffixes(List<E> list) {
        List<E> safeList = ListUtils.emptyIfNull(list);
        return IntStream.range(0, safeList.size())
                .mapToObj(start -> safeList.subList(start, safeList.size()));
    }
}
