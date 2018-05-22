package problems.iterators;

import org.junit.Assert;
import org.junit.Test;
import problems.iterators.IterablesMerger;
import problems.iterators.IteratorsComparator;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by mtumilowicz on 2017-05-17.
 */
public class IterablesMergerTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void mergeNullInputs() {
        IterablesMerger.merge(null);
    }

    @Test(expected = NullPointerException.class)
    public void mergeNotNullAndNullInput() {
        IterablesMerger.merge(new LinkedList<>(), null);
    }

    @Test
    public void merge2EmptyLists() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(), 
                IterablesMerger.merge(new LinkedList<>(), new LinkedList<>())));
    }

    @Test
    public void merge2NotEmptyListsSameType() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(Arrays.asList(1, 2, 3, 4)),
                IterablesMerger.merge(new LinkedList<>(Arrays.asList(1, 2)), 
                        new LinkedList<>(Arrays.asList(3, 4)))));
    }

    @Test
    public void merge2NotEmptyListsDiffType() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(Arrays.asList(1, 2, "a", "b")),
                IterablesMerger.merge(new LinkedList<>(Arrays.asList(1, 2)), 
                        new LinkedList<>(Arrays.asList("a", "b")))));
    }

    @Test
    public void merge3NotEmptyListsSameType() {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> b = new LinkedList<>(Arrays.asList(4, 5, 6));
        LinkedList<Integer> c = new LinkedList<>(Arrays.asList(7, 8, 9));
        
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)),
                IterablesMerger.merge(a, b, c)));
    }

    @Test
    public void merge3NotEmptyListsDiffType() {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<String> b = new LinkedList<>(Arrays.asList("a", "b", "c"));
        LinkedList<Boolean> c = new LinkedList<>(Arrays.asList(true, false, false));

        Assert.assertTrue(IteratorsComparator.equals(
                new LinkedList<>(Arrays.asList(1, 2, 3, "a", "b", "c", true, false, false)),
                IterablesMerger.merge(a, b, c)));
    }
}
