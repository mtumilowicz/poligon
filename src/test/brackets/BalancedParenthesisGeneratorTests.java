package test.brackets;

import org.junit.Test;
import problems.brackets.BalanceParenthesisChecker;
import problems.brackets.BalancedParenthesisGenerator;
import utils.CatalanNumberGenerator;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class BalancedParenthesisGeneratorTests {

    @Test
    public void severalPrimaryCases() {
        for (int i = 1; i <= 7; i++) {
            forGivenLength(i);
        }
    }

    private void forGivenLength(int pairsNumber) {
        Collection<String> result = BalancedParenthesisGenerator.generate(pairsNumber);
        assertEquals(result.size(), CatalanNumberGenerator.get(pairsNumber));
        assertTrue(BalanceParenthesisChecker.check(result));
    }
}
