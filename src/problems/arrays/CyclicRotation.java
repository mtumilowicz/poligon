package problems.arrays;

import com.google.common.base.Preconditions;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-05-04.
 */
public class CyclicRotation {
    public static int[] rotate(int[] a, int order) {
        Preconditions.checkArgument(a != null);
        Preconditions.checkArgument(a.length > 0);
        Preconditions.checkArgument(order >= 0);

        int[] copy = Arrays.copyOf(a, a.length);
        if(order > copy.length){
            order = order % copy.length;
        }
        
        int split = copy.length - order;

        int[] reversedFirstPart = reverse(copy, 0, split - 1);
        int[] reversedFirstAndSecondPart = reverse(reversedFirstPart, split, copy.length - 1);
        return reverse(reversedFirstAndSecondPart, 0, copy.length - 1);
    }

    public static int[] reverse(int[] a, int left, int right) {
        Preconditions.checkArgument(a != null && a.length > 0);
        Preconditions.checkArgument(left >= 0);
        Preconditions.checkArgument(right <= a.length);
        
        int[] copy = Arrays.copyOf(a, a.length);
        
        while(left < right) {
            int temp = copy[left];
            copy[left] = copy[right];
            copy[right] = temp;
            left++;
            right--;
        }
        return copy;
    }
}
