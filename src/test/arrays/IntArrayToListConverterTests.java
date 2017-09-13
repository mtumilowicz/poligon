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
        assertEquals(Collections.emptyList(), IntArrayToListConverter.convert(null));
    }

    @Test
    public void length_1() {
        assertEquals(Collections.singletonList(1), IntArrayToListConverter.convert(new int[]{1}));
    }

    @Test
    public void length_2() {
        assertEquals(Arrays.asList(1, 2), IntArrayToListConverter.convert(new int[]{1, 2}));
    }

    @Test
    public void length_2_wrong_order() {
        assertNotEquals(Arrays.asList(2, 1), IntArrayToListConverter.convert(new int[]{1, 2}));
    }

    @Test
    public void length_3_unsorted() {
        assertEquals(Arrays.asList(2, 1, 2), IntArrayToListConverter.convert(new int[]{2, 1, 2}));
    }
}
