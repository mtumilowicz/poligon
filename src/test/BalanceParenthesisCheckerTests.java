package test;

import problems.brackets.BalanceParenthesisChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-05.
 */
public class BalanceParenthesisCheckerTests {

    @Test
    public void empty() {
        assertTrue(BalanceParenthesisChecker.check(""));
    }

    @Test
    public void simpleBalanced() {
        assertTrue(BalanceParenthesisChecker.check("()"));
    }

    @Test
    public void complexBalanced() {
        assertTrue(BalanceParenthesisChecker.check("((((()()))()))"));
    }

    @Test
    public void simpleUnbalanced() {
        assertFalse(BalanceParenthesisChecker.check(")("));
    }

    @Test
    public void complexUnbalanced() {
        assertFalse(BalanceParenthesisChecker.check(")))((()()))))))()()((())"));
    }
    
    @Test
    public void balancedSimpleStringWithOtherCharacters() {
        assertTrue(BalanceParenthesisChecker.check("(a(b(c)))"));
    }

    @Test
    public void unbalancedSimpleStringWithOtherCharacters() {
        assertFalse(BalanceParenthesisChecker.check("(a(b(c)))))"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOddLength() {
        BalanceParenthesisChecker.check(")))");
    }
}
