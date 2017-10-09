package test.strings;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import problems.strings.RecursiveReverse;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-10-09.
 */
public class ReverseTests {
    
    @Test
    public void nullTest() {
        assertEquals(StringUtils.EMPTY, RecursiveReverse.reverse(null));
    }

    @Test
    public void oneLetter() {
        assertEquals("a", RecursiveReverse.reverse("a"));
    }

    @Test
    public void threeLetters() {
        assertEquals("abc", RecursiveReverse.reverse("cba"));
    }
}
