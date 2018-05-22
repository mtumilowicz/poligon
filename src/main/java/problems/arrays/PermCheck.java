package problems.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mtumilowicz on 2017-05-04.
 */
public class PermCheck {
    public static boolean check(int[] a) {
        a = ArrayUtils.nullToEmpty(a);
        boolean isPermutation = true;
        if (a.length > 1) {
            int min = ExtremeArrayValues.findMin(a);
            Set<Integer> values = toHashSet(a);
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
    
    private static Set<Integer> toHashSet(int[] a) {
        Set<Integer> values = new HashSet<>();
        Arrays.stream(ArrayUtils.nullToEmpty(a)).forEach(values::add);

        return values;
    }
}
