package problems.brackets;

import com.google.common.collect.ImmutableMap;

import java.util.Collection;

/**
 * Created by mtumilowicz on 2017-03-30.
 */
public class BalanceParenthesisChecker {
    private static final BalanceChecker checker = BalanceChecker.BalanceCheckerFactory.get(ImmutableMap.of(')','('));

    public static boolean check(String str) {
        return checker.check(str.replaceAll("[^()]*",""));
    }
    
    public static boolean check(Collection<String> collection) {
        return collection.parallelStream().allMatch(BalanceParenthesisChecker::check);
    }
}
