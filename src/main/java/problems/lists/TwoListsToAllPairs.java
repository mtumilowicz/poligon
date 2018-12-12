package problems.lists;

import lombok.NonNull;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by mtumilowicz on 2018-12-13.
 */
class TwoListsToAllPairs {
    static List<Pair> merge(@NonNull List<Integer> first,
                            @NonNull List<Integer> second) {

        return first.stream()
                .flatMap(i -> second.stream()
                        .map(j -> new Pair(i, j))
                )
                .collect(toList());
    }
}
