package test;

import problems.brackets.MinimalParenthesisFlipToBalance;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-05.
 */
public class MinimalParenthesisFlipToBalanceTest {

    @Test
    public void empty() {
        assertEquals(0, MinimalParenthesisFlipToBalance.get(""));
    }

    @Test
    public void simpleBalanced() {
        assertEquals(0, MinimalParenthesisFlipToBalance.get("()"));
    }

    @Test
    public void complexBalanced() {
        assertEquals(0, MinimalParenthesisFlipToBalance.get("((((()()))()))"));
    }

    @Test
    public void simpleUnbalanced() {
        assertEquals(2, MinimalParenthesisFlipToBalance.get(")("));
    }

    @Test
    public void complexUnbalanced() {
        assertEquals(5, MinimalParenthesisFlipToBalance.get(")))((()()))))))()()((())"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOddLength() {
        MinimalParenthesisFlipToBalance.get(")))");
    }
}
