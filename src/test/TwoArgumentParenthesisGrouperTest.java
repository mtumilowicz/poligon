package test;

import org.junit.Test;
import problems.brackets.BalanceParenthesisChecker;
import problems.brackets.TwoArgumentParenthesisGrouper;
import utils.CatalanNumberGenerator;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-12.
 */
public class TwoArgumentParenthesisGrouperTest {
    
    @Test(expected = NullPointerException.class)
    public void nullTest() {
        TwoArgumentParenthesisGrouper.generate(null);
    }
    
    @Test
    public void severalPrimaryCases() {
        StringBuilder sb = new StringBuilder("aa");
        for (int i = 1; i < 6; i++) {
            forGivenCatalanNumber(sb.toString(), i);
            sb.append("a");
        }
    }
    
    
    private void forGivenCatalanNumber(String sb, int i) {
        Objects.requireNonNull(sb);
        List<String> list = TwoArgumentParenthesisGrouper.generate(sb.toString());
        assertEquals(list.size(), CatalanNumberGenerator.get(i));
        BalanceParenthesisChecker.check(list);
    }
}
