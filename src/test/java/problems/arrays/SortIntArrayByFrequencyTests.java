package problems.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;
import problems.arrays.SortIntArrayByFrequency;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class SortIntArrayByFrequencyTests {
    @Test
    public void nullTest() {
        assertArrayEquals(ArrayUtils.EMPTY_INT_ARRAY, SortIntArrayByFrequency.sort(null));
    }

    @Test
    public void length_1() {
        assertArrayEquals(new int[]{1}, SortIntArrayByFrequency.sort(new int[]{1}));
    }

    @Test
    public void length_2() {
        assertArrayEquals(new int[]{1, 2}, SortIntArrayByFrequency.sort(new int[]{1, 2}));
    }

    @Test
    public void length_2_wrong_order() {
        Assert.assertThat(SortIntArrayByFrequency.sort(new int[]{1, 2}), IsNot.not(IsEqual.equalTo(new int[]{2, 1})));
    }

    @Test
    public void length_3_sorted() {
        assertArrayEquals(new int[]{2, 2, 1}, SortIntArrayByFrequency.sort(new int[]{1, 2, 2}));
    }

    @Test
    public void length_3_unsorted() {
        assertArrayEquals(new int[]{2, 2, 1}, SortIntArrayByFrequency.sort(new int[]{2, 1, 2}));
    }
}
