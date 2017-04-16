package test;

import org.junit.Test;
import problems.brackets.BalancedParenthesisGenerator;
import problems.brackets.BalancedPartsRemover;

import java.util.Objects;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2017-04-15.
 */
public class BalancedPartsRemoverTests {
    
    @Test(expected = NullPointerException.class)
    public void emptyTest() {
        BalancedPartsRemover.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalCharacters() {
        BalancedPartsRemover.remove("abcd");
    }
    
    @Test
    public void correctSimpleString() {
        assertTrue(Objects.equals(BalancedPartsRemover.remove("()"), "empty"));
    }
    
    @Test
    public void correctComplexStrings() {
        Set<String> allBalancedStrings = BalancedParenthesisGenerator.generate(5);
        for (String s : allBalancedStrings) {
            assertTrue(Objects.equals(BalancedPartsRemover.remove(s),"empty"));
        }
    }
    
    @Test
    public void incorrectSimpleString() {
        assertTrue(Objects.equals(BalancedPartsRemover.remove(")("),")("));
    }

    @Test
    public void correctInnerSimplePart() {
        assertTrue(Objects.equals(BalancedPartsRemover.remove(")))()(("),")))(("));
    }
    
    @Test
    public void correctInnerComplexPart() {
        assertTrue(Objects.equals(BalancedPartsRemover.remove("))(((()()))()(("),"))((("));
    }
}
