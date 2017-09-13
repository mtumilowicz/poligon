package test.brackets;

import org.junit.Test;
import problems.brackets.BalancedParenthesisGenerator;
import problems.brackets.BalancedPartsRemover;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-15.
 */
public class BalancedPartsRemoverTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void emptyTest() {
        BalancedPartsRemover.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalCharacters() {
        BalancedPartsRemover.remove("abcd");
    }
    
    @Test
    public void correctSimpleString() {
        assertEquals("empty", BalancedPartsRemover.remove("()"));
    }
    
    @Test
    public void correctComplexStrings() {
        Set<String> allBalancedStrings = BalancedParenthesisGenerator.generate(5);
        for (String s : allBalancedStrings) {
            assertEquals("empty",BalancedPartsRemover.remove(s));
        }
    }
    
    @Test
    public void incorrectSimpleString() {
        assertEquals(")(",BalancedPartsRemover.remove(")("));
    }

    @Test
    public void correctInnerSimplePart() {
        assertEquals(")))((",BalancedPartsRemover.remove(")))()(("));
    }
    
    @Test
    public void correctInnerComplexPart() {
        assertEquals("))(((",BalancedPartsRemover.remove("))(((()()))()(("));
    }
}
