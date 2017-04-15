package problems.brackets;

import com.google.common.math.LongMath;

import java.math.RoundingMode;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by mtumilowicz on 2017-03-30.
 */
public class MinimalBracketFlipsToBalance {

    public static void print(String str) {
        Objects.requireNonNull(str);
        System.out.println(get(str));
    }

    public static long get(String str) {
        Objects.requireNonNull(str);
        Stack<Character> afterBalancedRemoval = BalancedPartsRemover.remove(str);
        long openingsCount = afterBalancedRemoval.stream().filter(v -> v.equals('(')).count();
        long endingCount = afterBalancedRemoval.size() - openingsCount;
        return afterBalancedRemoval.size() % 2 != 0 ? -1 : LongMath.divide(openingsCount, 2, RoundingMode.CEILING) + LongMath.divide(endingCount, 2, RoundingMode.CEILING);
    }

}
