package test.arrays;

import org.junit.Test;
import problems.arrays.CyclicRotation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mtumilowicz on 2017-05-07.
 */
public class CyclicRotationTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullArray() {
        CyclicRotation.rotate(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyArray() {
        CyclicRotation.rotate(new int[]{}, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nonPositiveOrder() {
        CyclicRotation.rotate(new int[]{1}, -1);
    }

    @Test
    public void order0() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, CyclicRotation.rotate(new int[]{1, 2, 3, 4, 5}, 0));
    }

    @Test
    public void order0Neq() {
        assertNotEquals(new int[]{2, 1, 3, 4, 5}, CyclicRotation.rotate(new int[]{1, 2, 3, 4, 5}, 0));
    }

    @Test
    public void len2ord2Eq() {
        assertArrayEquals(new int[]{2, 1}, CyclicRotation.rotate(new int[]{1,2}, 1));
        CyclicRotation.rotate(new int[]{1,2}, 1);
    }

    @Test
    public void len2ord2Neq() {
        assertNotEquals(new int[]{1, 2}, CyclicRotation.rotate(new int[]{1,2}, 1));
    }

    @Test
    public void len6ord4Eq() {
        assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, CyclicRotation.rotate(new int[]{1, 2, 3, 4, 5, 6}, 4));
    }

    @Test
    public void len6ord4Neq() {
        assertNotEquals(new int[]{3, 1, 5, 6, 4, 2}, CyclicRotation.rotate(new int[]{1, 2, 3, 4, 5, 6}, 4));
    }
}
