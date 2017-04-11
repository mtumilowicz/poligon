package test;

import com.google.common.collect.ImmutableMap;
import interviewquestions.BalanceChecker;
import org.junit.Test;

import static interviewquestions.BalanceChecker.BalanceCheckerFactory;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-03-28.
 */
public class BalanceCheckerTests {

    @Test
    public void bijectionMapCorrectSymbolOrder() {
        BalanceChecker balanceChecker = BalanceCheckerFactory.get(ImmutableMap.of(']', '['));
        assertTrue(balanceChecker.check("[]"));
    }

    @Test
    public void bijectionMapOppositeSymbolOrder() {
        BalanceChecker balanceChecker = BalanceCheckerFactory.get(ImmutableMap.of('[', ']'));
        assertFalse(balanceChecker.check("[]"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullBijectionMap() {
        BalanceCheckerFactory.get(null);
    }

    @Test
    public void OneTypeBrackets() {
        BalanceChecker balanceChecker = BalanceCheckerFactory.get(ImmutableMap.of(']', '['));
        assertTrue(balanceChecker.check("[[]][][[]]"));
    }

    @Test
    public void twoTypesBrackets() {
        BalanceChecker balanceChecker = BalanceCheckerFactory.get(ImmutableMap.of(']', '[', ')','('));
        assertTrue(balanceChecker.check("[()][]([])([][])"));
    }

    @Test
    public void threeTypesBrackets() {
        BalanceChecker balanceChecker = BalanceCheckerFactory.get(ImmutableMap.of(']', '[', ')','(', '}', '{'));
        assertTrue(balanceChecker.check("{[()][]{([])}([][])}{}"));
    }
}
