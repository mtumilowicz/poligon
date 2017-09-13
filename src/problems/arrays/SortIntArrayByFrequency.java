package problems.arrays;

import org.apache.commons.lang3.ArrayUtils;
import problems.lists.SortIntListByFrequency;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class SortIntArrayByFrequency {
    public static int[] sort(int[] intArray) {
        intArray = ArrayUtils.nullToEmpty(intArray);

        return ArrayUtils.toPrimitive(
                SortIntListByFrequency.sort(IntArrayToListConverter.convert(intArray))
                        .toArray(new Integer[intArray.length]));
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{2,1,2})));
    }
}
