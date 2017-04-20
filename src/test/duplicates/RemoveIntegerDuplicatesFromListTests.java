package test.duplicates;

import org.junit.Test;
import problems.duplicates.RemoveIntegerDuplicatesFromList;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class RemoveIntegerDuplicatesFromListTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullCase() {
        RemoveIntegerDuplicatesFromList.remove(null);
    }
    
    @Test
    public void oneDuplicateLengthOne() {
        assertThat(Arrays.asList(1), is(RemoveIntegerDuplicatesFromList.remove(Arrays.asList(1, 1))));
    }

    @Test
    public void oneDuplicateLengthTwo() {
        assertThat(Arrays.asList(1, 2), is(RemoveIntegerDuplicatesFromList.remove(Arrays.asList(1, 1, 2))));
    }

    @Test
    public void twiceSameDuplicateLengthThree() {
        assertThat(Arrays.asList(1, 2), is(RemoveIntegerDuplicatesFromList.remove(Arrays.asList(1, 1, 1, 2))));
    }

    @Test
    public void twoDuplicatesLengthThree() {
        assertThat(Arrays.asList(1, 2), is(RemoveIntegerDuplicatesFromList.remove(Arrays.asList(1, 1, 2, 2))));
    }
}
