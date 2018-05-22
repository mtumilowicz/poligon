package duplicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class IntegerDuplicatesRemoverTests extends DuplicatesRemoverTests<Integer> {

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
        return new LinkedList<>(Arrays.asList(1, 1, 2, 1, 3, 4, 2, 5, 1, 2, 4, 4, 10, 2, 3, 4, 7, 8));
    }
}
