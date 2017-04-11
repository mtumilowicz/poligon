package interviewquestions;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by mtumilowicz on 2017-03-23.
 */
public class BalanceChecker {
    /**
     * key is closing symbol, value is opening symbol
     */
    private final ImmutableMap<Character, Character> balanceBijectionMap;

    private BalanceChecker(ImmutableMap<Character, Character> balanceBijectionMap) {
        Objects.requireNonNull(balanceBijectionMap);
        this.balanceBijectionMap = balanceBijectionMap;
    }

    public boolean check(String string) {
        Objects.requireNonNull(string);
        Preconditions.checkArgument(string.length() % 2 == 0, "String has to be even!");
        Stack<Character> bracketsStack = new Stack<>();
        for (int i = 0; i<string.length(); i++) {
            char symbol = string.charAt(i);
            if (balanceBijectionMap.values().contains(symbol)) {
                bracketsStack.push(symbol);
            }
            else {
                if (bracketsStack.isEmpty()) {
                    return false;
                }
                if (!bracketsStack.pop().equals(balanceBijectionMap.get(symbol))) {
                    return false;
                }
            }
        }
        return bracketsStack.isEmpty();
    }

    public static class BalanceCheckerFactory {
        public static BalanceChecker get(ImmutableMap<Character, Character> balanceBijectionMap) {
            Objects.requireNonNull(balanceBijectionMap);

            validateBijection(balanceBijectionMap);
            return new BalanceChecker(balanceBijectionMap);
        }

        private static void validateBijection(ImmutableMap<Character, Character> balanceBijectionMap) {
            Objects.requireNonNull(balanceBijectionMap);

            if (balanceBijectionMap.values().size() != (new HashSet<>(balanceBijectionMap.values()).size())) {
                throw new IllegalArgumentException("Key -> Value is not a bijection!");
            }
        }
    }

}
