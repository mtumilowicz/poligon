package problems.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-08-21.
 */
public class CheckIfTwoStringsAreAnagramsTest {

    @Test
    public void oneLength_differs() {
        assertFalse(CheckIfTwoStringsAreAnagrams.check("a", "b"));
    }

    @Test
    public void oneLength_same() {
        assertTrue(CheckIfTwoStringsAreAnagrams.check("a", "a"));
    }

    @Test
    public void twoLength_differs() {
        assertFalse(CheckIfTwoStringsAreAnagrams.check("ab", "cd"));
    }

    @Test
    public void twoLength_same() {
        assertTrue(CheckIfTwoStringsAreAnagrams.check("ab", "ab"));
    }

    @Test
    public void twoLength_same_revOrder() {
        assertTrue(CheckIfTwoStringsAreAnagrams.check("ab", "ba"));
    }
    
    @Test
    public void _10Length_differs_1() {
//        given
        String first = "aabcddeeaf";
        String second = "aabcddfeaf";
//        expect
        assertFalse(CheckIfTwoStringsAreAnagrams.check(first, second));
    }

    @Test
    public void _10Length_same() {
//        given
        String first = "aabcddeeaf";
        String second = "aebdacfeda";
//        expect
        assertTrue(CheckIfTwoStringsAreAnagrams.check(first, second));
    }
}