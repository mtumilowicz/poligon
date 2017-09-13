package problems.arrays;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by mtumilowicz on 2017-05-04.
 */
public class PermCheck {
    public static boolean check(int[] a) {
        Preconditions.checkArgument(a != null);
        boolean isPermutation = true;
        if (a.length > 1) {
            int min = ExtremeArrayValues.findMin(a);
            HashSet<Integer> values = toHashSet(a);
            int max = min + a.length - 1;
            for (int i = min; i <= max; i++) {
                if (!values.contains(i)) {
                    isPermutation = false;
                    break;
                }
            }
        }
        return isPermutation;
    }
    
    private static HashSet<Integer> toHashSet(int[] a) {
        Preconditions.checkArgument(a != null);
        HashSet<Integer> values = new HashSet<>();
        Arrays.stream(a).forEach(values::add);

        return values;
    }
}
