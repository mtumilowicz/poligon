package problems.brackets;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mtumilowicz on 2017-03-28.
 */
public class BalancedParenthesisGenerator {

    public static void print(int pairsNumber) {
        System.out.println(Arrays.toString(generate(pairsNumber).toArray()));
    }

    public static Set<String> generate(int pairsNumber) {
        HashSet<String> result = new HashSet<>();
        construct(result, "", pairsNumber, pairsNumber);
        return result;
    }

    private static void construct(Set<String> result, String s, int left, int right) {
        Preconditions.checkArgument(result != null && s != null);
        if (left > right)
            return;

        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            construct(result, s + "(", left - 1, right);
        }

        if (right > 0) {
            construct(result, s + ")", left, right - 1);
        }
    }
}
