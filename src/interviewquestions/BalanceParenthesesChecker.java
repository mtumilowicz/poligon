package interviewquestions;

import com.google.common.collect.ImmutableMap;

/**
 * Created by mtumilowicz on 2017-03-30.
 */
public class BalanceParenthesesChecker {
    private static final BalanceChecker checker = BalanceChecker.BalanceCheckerFactory.get(ImmutableMap.of(')','('));

    public static boolean check(String str) {
        return checker.check(str);
    }
}
