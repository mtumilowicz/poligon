package problems.duplicates;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class FindUniqueIntInAnArrayOfTwins {
    public static int find(int[] a) {
        Preconditions.checkArgument(a != null && a.length > 0);
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result^=a[i];
        }
        return result;
    }
}
