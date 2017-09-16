package problems.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class IntArrayToListConverter {
    public static List<Integer> convert(int[] a) {
        return Arrays.stream(ArrayUtils.nullToEmpty(a))
                .boxed()
                .collect(Collectors.toList());
    }
}
