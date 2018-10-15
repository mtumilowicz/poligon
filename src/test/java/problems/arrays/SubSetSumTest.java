package problems.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-10-13.
 */
public class SubSetSumTest {
    
    @Test
    public void isAnySubset_recursive_noRepetitions_2() {
        assertFalse(SubSetSum.isAnySubset_recursive_noRepetitions(new int[]{1}, 2));
    }

    @Test
    public void isAnySubset_recursive_noRepetitions_5() {
        assertTrue(SubSetSum.isAnySubset_recursive_noRepetitions(new int[]{1, 3, 2}, 5)); // 3 2
    }

    @Test
    public void isAnySubset_recursive_noRepetitions_10() {
        assertTrue(SubSetSum.isAnySubset_recursive_noRepetitions(new int[]{1, 3, 2, 12, 15, 6}, 10)); // 1 3 6
    }

    @Test
    public void isAnySubset_recursive_noRepetitions_13() {
        assertFalse(SubSetSum.isAnySubset_recursive_noRepetitions(new int[]{1, 3, 2, 14, 15, 6}, 13));
    }
    
    @Test
    public void isAnySubset_recursive_repetitions_2() {
        assertTrue(SubSetSum.isAnySubset_recursive_repetitions(new int[]{1}, 2)); // 1 x 2
    }

    @Test
    public void isAnySubset_recursive_repetitions_13() {
        assertTrue(SubSetSum.isAnySubset_recursive_repetitions(new int[]{5, 6, 14, 2, 28, 1, 3}, 13)); // 1 x 13
    }

    @Test
    public void isAnySubset_recursive_repetitions_15() {
        assertTrue(SubSetSum.isAnySubset_recursive_repetitions(new int[]{2, 3}, 15)); // (2, 3) x 3
    }

    @Test
    public void isAnySubset_recursive_dynamically_2() {
        assertFalse(SubSetSum.isAnySubset_dynamically(new int[]{1}, 2));
    }

    @Test
    public void isAnySubset_recursive_dynamically_5() {
        assertTrue(SubSetSum.isAnySubset_dynamically(new int[]{1, 3, 2}, 5)); // 3 2
    }

    @Test
    public void isAnySubset_recursive_dynamically_10() {
        assertTrue(SubSetSum.isAnySubset_dynamically(new int[]{1, 3, 2, 12, 15, 6}, 10)); // 1 3 6
    }

    @Test
    public void isAnySubset_recursive_dynamically_13() {
        assertFalse(SubSetSum.isAnySubset_dynamically(new int[]{1, 3, 2, 14, 15, 6}, 13));
    }

}