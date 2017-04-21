package problems.duplicates;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class FindMissingIntInAnArithmeticSequence {
    public static int find(int[] array, int base, int diff) {
        Preconditions.checkArgument(array != null);
        Preconditions.checkArgument(array.length > 1);
        int first = array[0];
        int xorAll = base;
        int xorArray = first;
        for (int i = 1; i <= array.length; i++) {
            xorAll^=(base+i*diff);
        }
        for (int i = 1; i < array.length; i++) {
            xorArray^=array[i];
        }
        return xorAll ^ xorArray;
    }
}
