package problems.duplicates;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class FindMissingIntInAnArrayOfConsecutiveIntegersFromOne {
    public static int find(int[] array) {
        Preconditions.checkArgument(array != null);
        Preconditions.checkArgument(array.length > 1);
        int first = array[0];
        int xorAll = 1;
        int xorArray = first;
        for (int i = 2; i <= array.length+1; i++) {
            xorAll^=i;
        }
        for (int i = 1; i < array.length; i++) {
            xorArray^=array[i];
        }
        return xorAll ^ xorArray;
    }
}
