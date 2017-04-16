package test;

import org.junit.Test;
import problems.brackets.BalanceParenthesisChecker;
import problems.brackets.TwoArgumentParenthesisGrouper;
import utils.CatalanNumberGenerator;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
            List<String> list = TwoArgumentParenthesisGrouper.generate(sb.toString());
            assertEquals(list.size(), CatalanNumberGenerator.get(i));
            for (String s : list) {
                assertTrue(BalanceParenthesisChecker.check(s));
            }
            sb.append("a");
        }
    }
}
