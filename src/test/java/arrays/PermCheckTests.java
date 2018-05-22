package arrays;

import org.junit.Test;
import problems.arrays.PermCheck;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-05-10.
 */
public class PermCheckTests {
    
    @Test
    public void nullTest() {
        assertTrue(PermCheck.check(null));
    }
    
    @Test
    public void emptyArray() {
        assertTrue(PermCheck.check(new int[]{}));
    }

    @Test
    public void len1() {
        assertTrue(PermCheck.check(new int[]{1}));
    }

    @Test
    public void len2TReverse() {
        assertTrue(PermCheck.check(new int[]{2, 1}));
    }

    @Test
    public void len2FReverse() {
        assertFalse(PermCheck.check(new int[]{3, 1}));
    }

    @Test
    public void len2TCorrect() {
        assertTrue(PermCheck.check(new int[]{1, 2}));
    }

    @Test
    public void len2FCorrect() {
        assertFalse(PermCheck.check(new int[]{1, 3}));
    }

    @Test
    public void len5T() {
        assertTrue(PermCheck.check(new int[]{2, 1, 4, 3, 5}));
    }

    @Test
    public void len5F() {
        assertFalse(PermCheck.check(new int[]{2, 1, 4, 5, 8, 0}));
    }
}
