package problems.brackets;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;

import java.math.RoundingMode;
import java.util.Stack;

/**
 * Created by mtumilowicz on 2017-03-30.
 */
public class MinimalParenthesisFlipToBalance {

    public static void print(String str) {
        Preconditions.checkArgument(str != null);
        System.out.println(get(str));
    }

    public static long get(String str) {
        Preconditions.checkArgument(str != null && (str.length() % 2) == 0, "String has to be even.");
        Preconditions.checkArgument(str.matches("^[()]*$"), "Only '(' & ')' allowed.");
        Stack<Character> afterBalancedRemoval = BalancedPartsRemover.removeAndReturnAsStack(str);
        long openingsCount = afterBalancedRemoval.stream().filter(v -> v.equals('(')).count();
        long endingCount = afterBalancedRemoval.size() - openingsCount;
        return afterBalancedRemoval.size() % 2 != 0 ? -1 : LongMath.divide(openingsCount, 2, RoundingMode.CEILING) + LongMath.divide(endingCount, 2, RoundingMode.CEILING);
    }

}
