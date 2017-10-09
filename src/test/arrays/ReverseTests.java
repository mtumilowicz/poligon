package test.arrays;

import org.junit.Test;
import problems.arrays.Reverse;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by mtumilowicz on 2017-10-09.
 */
public class ReverseTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        Reverse.reverse(null);
    }
    
    @Test
    public void oneElement() {
        Integer[] test = new Integer[]{1};
        Integer[] control = new Integer[]{1};
        assertArrayEquals(control, Reverse.reverse(test));
    }

    @Test
    public void twoElements() {
        Integer[] test = new Integer[]{1,2};
        Integer[] control = new Integer[]{2,1};
        assertArrayEquals(control, Reverse.reverse(test));
    }

    @Test
    public void threeElement() {
        Integer[] test = new Integer[]{1,3,2};
        Integer[] control = new Integer[]{2,3,1};
        assertArrayEquals(control, Reverse.reverse(test));
    }
}
