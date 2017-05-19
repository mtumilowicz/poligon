package test.iterators;

import org.junit.Assert;
import org.junit.Test;
import problems.iterators.IteratorsComparator;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by mtumilowicz on 2017-05-17.
 */
public class IteratorsComparatorTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void fNull() {
        IteratorsComparator.equals(null, new LinkedList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void sNull() {
        IteratorsComparator.equals(new LinkedList<>(), null);
    }

    @Test
    public void fEmptySEmpty() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(), new LinkedList<>()));
    }

    @Test
    public void fEmptySNotEmpty() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(), new LinkedList<>(Arrays.asList(1))));
    }

    @Test
    public void fNotEmptySEmpty() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList(1)), new LinkedList<>()));
    }
    
    @Test
    public void emptyDifferentTypes() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<String>(), new LinkedList<Integer>()));
    }

    @Test
    public void notEmptyDifferentTypes() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a")), 
                new LinkedList<>(Arrays.asList(1))));
    }

    @Test
    public void sameElementLength1() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a")),
                new LinkedList<>(Arrays.asList("a"))));
    }

    @Test
    public void same2ElementsLength2() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a", "b")),
                new LinkedList<>(Arrays.asList("a", "b"))));
    }

    @Test
    public void same2ElementsRevOrderLength2() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("b", "a")),
                new LinkedList<>(Arrays.asList("a", "b"))));
    }

    @Test
    public void differentElementsLength3() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("c", "b", "a")),
                new LinkedList<>(Arrays.asList("d", "e", "f"))));
    }

    @Test
    public void fLength1SLength2() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a")),
                new LinkedList<>(Arrays.asList("a", "b"))));
    }

    @Test
    public void fLength2SLength1() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a", "b")),
                new LinkedList<>(Arrays.asList("a"))));
    }

    @Test
    public void sameLength4SameElementsSameOrder() {
        Assert.assertTrue(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a", "b", "c", "d")),
                new LinkedList<>(Arrays.asList("a", "b", "c", "d"))));
    }

    @Test
    public void sameLength4SameElementsDiffOrder() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a", "c", "b", "d")),
                new LinkedList<>(Arrays.asList("a", "b", "c", "d"))));
    }

    @Test
    public void sameLength4DiffElementsSameOrder() {
        Assert.assertFalse(IteratorsComparator.equals(new LinkedList<>(Arrays.asList("a", "b", "c", "z")),
                new LinkedList<>(Arrays.asList("a", "b", "c", "d"))));
    }
}
