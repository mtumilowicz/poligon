package problems.duplicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class IntegerOccurrencesCounterTest extends OccurrencesCounterTests<Integer> {
    
    @Override
    public List<Integer> getSingleElementList() {
        return new LinkedList<>(Collections.singletonList(1));
    }

    @Override
    public List<Integer> getTwoEqualsElementsListOfLengthTwo() {
        return new LinkedList<>(Arrays.asList(1, 1));
    }

    @Override
    public List<Integer> getList() {
        return new LinkedList<>(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 1, 3, 4, 1, 5, 7, 6, 6, 6));
    }
}
