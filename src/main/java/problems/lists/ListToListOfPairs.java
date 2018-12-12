package problems.lists;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2018-07-27.
 */
class ListToListOfPairs {
    static List<Pair> convert(List<Integer> list) {
        list = ListUtils.emptyIfNull(list);
        Preconditions.checkArgument(list.size() % 2 == 0);
        Deque<Integer> deque = new ArrayDeque<>(ListUtils.emptyIfNull(list));

        List<Pair> result = new LinkedList<>();

        while (!deque.isEmpty()) {
            result.add(new Pair(deque.poll(), deque.poll()));
        }

        return result;
    }
}

