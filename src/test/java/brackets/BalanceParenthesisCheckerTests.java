package brackets;

import problems.brackets.BalanceParenthesisChecker;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-05.
 */
public class BalanceParenthesisCheckerTests {
    
    private static Collection<String> balanceBracketStrings = new LinkedList<>(Arrays.asList("", 
                                                                                           "()", 
                                                                                           "()()", 
                                                                                           "()(()(()()))",
                                                                                           "((((())))())"));
    
    private static Collection<String> unbalanceBracketStrings = new LinkedList<>(Arrays.asList("",
                                                                                             "((",
                                                                                             "()))",
                                                                                             "()(()((()))(",
                                                                                             "(((())))())("));

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
    
    @Test
    public void balanceBracketStringList() {
        assertTrue(BalanceParenthesisChecker.check(balanceBracketStrings));
    }
    
    @Test
    public void unbalanceBracketStringList() {
        assertFalse(BalanceParenthesisChecker.check(unbalanceBracketStrings));
    }
}
