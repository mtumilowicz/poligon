package brackets;

import com.google.common.base.Preconditions;
import org.junit.Test;
import problems.brackets.BalanceParenthesisChecker;
import problems.brackets.TwoArgumentParenthesisGrouper;
import utils.CatalanNumberGenerator;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-12.
 */
public class TwoArgumentParenthesisGrouperTests {
    
    @Test(expected = IllegalArgumentException.class)
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
        Preconditions.checkArgument(sb != null);
        List<String> list = TwoArgumentParenthesisGrouper.generate(sb);
        assertEquals(list.size(), CatalanNumberGenerator.get(i));
        BalanceParenthesisChecker.check(list);
    }
}
