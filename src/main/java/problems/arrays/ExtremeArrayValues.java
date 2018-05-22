package problems.arrays;

import com.google.common.base.Preconditions;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-05-04.
 */
public class ExtremeArrayValues {
    
    public static int findMin(int[] a) {
        Preconditions.checkArgument(a != null);
        Preconditions.checkArgument(a.length > 0);

        return Arrays.stream(a).min().getAsInt();
    }

    public static int findMax(int[] a) {
        Preconditions.checkArgument(a != null);
        Preconditions.checkArgument(a.length > 0);

        return Arrays.stream(a).max().getAsInt();
    }
}
