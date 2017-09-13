package test.lists;

import org.junit.Test;
import problems.lists.SortIntListByFrequency;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class SortIntListByFrequencyTests {
    @Test
    public void nullTest() {
        assertEquals(SortIntListByFrequency.sort(null), Collections.emptyList());
    }

    @Test
    public void length_1() {
        assertEquals(SortIntListByFrequency.sort(Collections.singletonList(1)), Collections.singletonList(1));
    }

    @Test
    public void length_2() {
        assertEquals(SortIntListByFrequency.sort(Arrays.asList(1, 2)), Arrays.asList(1, 2));
    }

    @Test
    public void length_2_wrong_order() {
        assertNotEquals(SortIntListByFrequency.sort(Arrays.asList(1, 2)), Arrays.asList(2, 1));
    }

    @Test
    public void length_3_sorted() {
        assertEquals(SortIntListByFrequency.sort(Arrays.asList(1, 2, 2)), Arrays.asList(2, 2, 1));
    }

    @Test
    public void length_3_unsorted() {
        assertEquals(SortIntListByFrequency.sort(Arrays.asList(2, 1, 2)), Arrays.asList(2, 2, 1));
    }
}
