package test.duplicates;

import com.google.common.base.Preconditions;
import org.junit.Test;
import problems.duplicates.OccurrencesCounter;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public abstract class OccurrencesCounterTests<E> {
    
    public abstract List<E> getSingleElementList();
    public abstract List<E> getTwoEqualsElementsListOfLengthTwo();
    public abstract List<E> getList();

    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        OccurrencesCounter.<E>count(null);
    }

    @Test
    public void singleElementList() {
        test(getSingleElementList());
    }

    @Test
    public void twoEqualsElementsListOfLengthTwo() {
        test(getTwoEqualsElementsListOfLengthTwo());
    }

    @Test
    public void list() {
        test(getList());
    }

    private void test(List<E> list) {
        Preconditions.checkArgument(list != null);
        assertEquals(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())), OccurrencesCounter.count(list));
    }
}
