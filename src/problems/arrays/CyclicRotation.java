package problems.arrays;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-05-04.
 */
public class CyclicRotation {
    public static Integer[] rotate(Integer[] a, int order) {
        Preconditions.checkArgument(a != null);
        Preconditions.checkArgument(a.length > 0);
        Preconditions.checkArgument(order >= 0);

        List<Integer> integers = Arrays.asList(a);

        Collections.rotate(integers, order);
        
        return integers.toArray(new Integer[a.length]);
    }
}
