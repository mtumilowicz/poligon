package test;

import interviewquestions.BalanceParenthesesChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-05.
 */
public class BalanceParenthesesCheckerTests {

    @Test
    public void empty() {
        assertTrue(BalanceParenthesesChecker.check(""));
    }

    @Test
    public void simpleBalanced() {
        assertTrue(BalanceParenthesesChecker.check("()"));
    }

    @Test
    public void complexBalanced() {
        assertTrue(BalanceParenthesesChecker.check("((((()()))()))"));
    }

    @Test
    public void simpleUnbalanced() {
        assertFalse(BalanceParenthesesChecker.check(")("));
    }

    @Test
    public void complexUnbalanced() {
        assertFalse(BalanceParenthesesChecker.check(")))((()()))))))()()((())"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOddLength() {
        BalanceParenthesesChecker.check(")))");
    }
}
