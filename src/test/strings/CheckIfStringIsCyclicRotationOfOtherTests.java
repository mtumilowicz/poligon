package test.strings;

import org.junit.Test;
import problems.strings.CheckIfStringIsCyclicRotationOfOther;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class CheckIfStringIsCyclicRotationOfOtherTests {
    @Test
    public void first_null_second_null() {
        assertTrue(CheckIfStringIsCyclicRotationOfOther.check(null, null));
    }

    @Test
    public void first_null_second_empty() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check(null, ""));
    }

    @Test
    public void first_null_second_notEmpty() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check(null, "a"));
    }

    @Test
    public void first_empty_second_null() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check("", null));
    }

    @Test
    public void first_notEmpty_second_null() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check("a", null));
    }

    @Test
    public void first_notEmpty_second_empty() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check("a", ""));
    }

    @Test
    public void first_empty_second_notEmpty() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check("", "a"));
    }

    @Test
    public void first_notEmpty6_second_notEmpty6_fail() {
        assertFalse(CheckIfStringIsCyclicRotationOfOther.check("abbaba", "abbabb"));
    }

    @Test
    public void first_notEmpty6_second_notEmpty6() {
        assertTrue(CheckIfStringIsCyclicRotationOfOther.check("abbaba", "abaabb"));
    }
}
