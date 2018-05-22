package problems.duplicates;

import org.junit.Test;
import problems.duplicates.FindUniqueIntInAnArrayOfTwins;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class FindUniqueIntInAnArrayOfTwinsTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullCase() {
        FindUniqueIntInAnArrayOfTwins.find(null);
    }

    @Test
    public void single() {
        assertEquals(1, FindUniqueIntInAnArrayOfTwins.find(new int[]{1}));
    }

    @Test
    public void complex() {
        assertEquals(3, FindUniqueIntInAnArrayOfTwins.find(new int[]{1, 2, 3, 4, 5, 1, 2, 4, 5}));
    }
}
