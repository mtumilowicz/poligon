package test;

import interviewquestions.MinimalBracketFlipsToBalance;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-05.
 */
public class MinimalBracketFlipsToBalanceTest {

    @Test
    public void empty() {
        assertEquals(0, MinimalBracketFlipsToBalance.get(""));
    }

    @Test
    public void simpleBalanced() {
        assertEquals(0, MinimalBracketFlipsToBalance.get("()"));
    }

    @Test
    public void complexBalanced() {
        assertEquals(0, MinimalBracketFlipsToBalance.get("((((()()))()))"));
    }

    @Test
    public void simpleUnbalanced() {
        assertEquals(2, MinimalBracketFlipsToBalance.get(")("));
    }

    @Test
    public void complexUnbalanced() {
        assertEquals(5, MinimalBracketFlipsToBalance.get(")))((()()))))))()()((())"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOddLength() {
        MinimalBracketFlipsToBalance.get(")))");
    }
}
