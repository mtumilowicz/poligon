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
        assertFalse(SubSetSum.isAnySubset_recursive_noRepetitions(new int[]{1, 3, 2, 14, 15, 6}, 13));
    }

}