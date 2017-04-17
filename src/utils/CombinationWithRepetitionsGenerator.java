package utils;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by mtumilowicz on 2017-03-28.
 */
public class CombinationWithRepetitionsGenerator {

    public static void print(String str, int expectedLength) {
        Preconditions.checkArgument(str != null);
        System.out.println(Arrays.toString(generate(str, expectedLength).toArray()));
    }

    public static HashSet<String> generate (String str, int expectedLength) {
        Preconditions.checkArgument(str != null);
        HashSet<String> result = new HashSet<>();
        construct(result, "", str, expectedLength);
        return result;
    }


    private static void construct(HashSet<String> result, String prefix, String str, int expectedLength) {
        Preconditions.checkArgument(result != null && prefix != null && str != null);
        if(prefix.length() == expectedLength)
        {
            result.add(prefix);
            return;
        }

        for(int i=0; i<str.length(); i++) {
            construct(result, prefix + str.charAt(i), str, expectedLength);
        }
    }
}
