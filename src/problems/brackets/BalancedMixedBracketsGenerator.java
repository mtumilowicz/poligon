package problems.brackets;

import com.google.common.collect.ImmutableMap;
import utils.CombinationWithRepetitionsGenerator;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class BalancedMixedBracketsGenerator {

    private static final BalanceChecker balanceChecker = BalanceChecker.BalanceCheckerFactory.get(ImmutableMap.of(')','(','}','{',']','['));

    public static void print (int pairsNumber) {
        System.out.println(Arrays.toString(generate(2*pairsNumber).toArray()));
    }

    public static Set<String> generate(int expectedLength) {
        return CombinationWithRepetitionsGenerator.generate("(){}[]", expectedLength).stream().filter(balanceChecker::check).collect(Collectors.toSet());
    }
}
