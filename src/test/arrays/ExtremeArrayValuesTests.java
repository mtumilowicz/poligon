package test.arrays;

import org.junit.Test;
import problems.arrays.ExtremeArrayValues;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mtumilowicz on 2017-05-10.
 */
public class ExtremeArrayValuesTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void findMinNullTest() {
        ExtremeArrayValues.findMin(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxNullTest() {
        ExtremeArrayValues.findMax(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinEmptyArray() {
        ExtremeArrayValues.findMin(new int[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxEmptyArray() {
        ExtremeArrayValues.findMax(new int[]{});
    }
    
    @Test
    public void findMinLen1() {
        assertEquals(2, ExtremeArrayValues.findMin(new int[]{2}));
    }

    @Test
    public void findMinLen6() {
        assertEquals(2, ExtremeArrayValues.findMin(new int[]{6, 5, 2, 4, 3, 8}));
    }

    @Test
    public void findMinLen1Neq() {
        assertNotEquals(1, ExtremeArrayValues.findMin(new int[]{2}));
    }

    @Test
    public void findMinLen6Neq() {
        assertNotEquals(1, ExtremeArrayValues.findMin(new int[]{6, 5, 2, 4, 3, 8}));
    }

    @Test
    public void findMaxLen1() {
        assertEquals(2, ExtremeArrayValues.findMax(new int[]{2}));
    }

    @Test
    public void findMaxLen6() {
        assertEquals(8, ExtremeArrayValues.findMax(new int[]{6, 5, 2, 4, 3, 8}));
    }

    @Test
    public void findMaxLen1Neq() {
        assertNotEquals(1, ExtremeArrayValues.findMax(new int[]{2}));
    }

    @Test
    public void findMaxLen6Neq() {
        assertNotEquals(1, ExtremeArrayValues.findMax(new int[]{6, 5, 2, 4, 3, 8}));
    }
}
