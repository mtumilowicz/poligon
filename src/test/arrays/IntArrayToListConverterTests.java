package test.arrays;

import org.junit.Test;
import problems.arrays.IntArrayToListConverter;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class IntArrayToListConverterTests {
    @Test
    public void nullTest() {
        assertEquals(IntArrayToListConverter.convert(null), Collections.EMPTY_LIST);
    }

    @Test
    public void length_1() {
        assertEquals(IntArrayToListConverter.convert(new int[]{1}), Collections.singletonList(1));
    }

    @Test
    public void length_2() {
        assertEquals(IntArrayToListConverter.convert(new int[]{1, 2}), Arrays.asList(1, 2));
    }

    @Test
    public void length_2_wrong_order() {
        assertNotEquals(IntArrayToListConverter.convert(new int[]{1, 2}), Arrays.asList(2, 1));
    }

    @Test
    public void length_3_unsorted() {
        assertEquals(IntArrayToListConverter.convert(new int[]{2, 1, 2}), Arrays.asList(2, 1, 2));
    }
}
