package test;

import com.google.common.collect.ImmutableMap;
import problems.brackets.BalancedBracketsGenerator;
import problems.brackets.BalanceChecker;
import org.junit.Test;
import utils.CatalanNumberGenerator;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class BalanceBracketsGeneratorTests {

    private BalanceChecker balanceChecker = BalanceChecker.BalanceCheckerFactory.get(ImmutableMap.of(')','('));

    @Test
    public void severalPrimaryCases() {
        for (int i = 1; i <= 7; i++) {
            forGivenLength(i);
        }
    }

    private void forGivenLength(int pairsNumber) {
        Set<String> result = BalancedBracketsGenerator.generate(pairsNumber);
        assertEquals(result.size(), CatalanNumberGenerator.get(pairsNumber));
        // TODO threads
        for (String s : result) {
            assertTrue(balanceChecker.check(s));
        }
    }


}
