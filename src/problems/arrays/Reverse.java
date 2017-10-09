package problems.arrays;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by mtumilowicz on 2017-10-09.
 */
public class Reverse {
    public static <T> T[] reverse(T[] array) {
        Preconditions.checkArgument(ArrayUtils.isNotEmpty(array));
        
        T temp;
        int size = array.length;
        for (int i = 0; i <= (size - 1) / 2; i++) {
            temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
        
        return array;
    }
}
