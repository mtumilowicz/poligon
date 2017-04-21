package test.duplicates;

import org.junit.Test;
import problems.duplicates.FindMissingIntInAnArrayOfConsecutiveIntegersFromOne;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class FindMissingIntInAnArrayOfConsecutiveIntegersFromOneTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void singleElement() {
        FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(new int[]{1});
    }

    @Test
    public void missing2() {
        assertEquals(2, FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(new int[]{1, 3}));
    }

    @Test
    public void missing3() {
        assertEquals(3, FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(new int[]{1, 2, 4}));
    }

    @Test
    public void missing5() {
        assertEquals(5, FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    public void missingFirst() {
        assertEquals(1, FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(new int[]{2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void missingLast() {
        assertEquals(8, FindMissingIntInAnArrayOfConsecutiveIntegersFromOne.find(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
}
