package problems.lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mtumilowicz on 2018-12-13.
 */
public class TwoListsToAllPairsTest {

    @Test
    public void merge() {
        List<Integer> first = Arrays.asList(1, 2, 3);
        List<Integer> second = Arrays.asList(4, 5);

        List<Pair> merge = TwoListsToAllPairs.merge(first, second);

        assertThat(merge, is(Arrays.asList(
                new Pair(1, 4),
                new Pair(1, 5),
                new Pair(2, 4),
                new Pair(2, 5),
                new Pair(3, 4),
                new Pair(3, 5)
        )));
    }
}