package interviewquestions;

import com.google.common.collect.ImmutableMap;
import utils.CombinationWithRepetitionsGenerator;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class BalancedMixedBracketsGenerator {

    static final BalanceChecker balanceChecker = BalanceChecker.BalanceCheckerFactory.get(ImmutableMap.of(')','(','}','{',']','['));

    static public void print (int pairsNumber) {
        System.out.println(Arrays.toString(generate(2*pairsNumber).toArray()));
    }

    static public Set<String> generate(int expectedLength) {
        return CombinationWithRepetitionsGenerator.generate("(){}[]", expectedLength).stream().filter(balanceChecker::check).collect(Collectors.toSet());
    }
}
