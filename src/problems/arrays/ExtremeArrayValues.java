package problems.arrays;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-05-04.
 */
public class ExtremeArrayValues {
    
    public static int findMin(int[] a) {
        Preconditions.checkArgument(a != null);
        Preconditions.checkArgument(a.length > 0);
        
        int min = a[0];
        for (int v : a) {
            if (min < v) {
                min = v;
            }
        }
        return min;
    }

    public static int findMax(int[] a) {
        Preconditions.checkArgument(a != null);
        Preconditions.checkArgument(a.length > 0);
        
        int max = a[0];
        for (int v : a) {
            if (max > v) {
                max = v;
            }
        }
        return max;
    }
}
