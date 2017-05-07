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
        if (a.length > 0) {
            int min = ExtremeArrayValues.findMin(a);
            int max = min + a.length - 1;
            HashSet<Integer> values = new HashSet(Arrays.asList(a));

            for (int i = min; i <= max; i++) {
                if (!values.contains(i)) {
                    isPermutation = false;
                    break;
                }
            }
        }
        return isPermutation;
    }
}
