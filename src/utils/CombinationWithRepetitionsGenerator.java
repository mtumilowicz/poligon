package utils;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by mtumilowicz on 2017-03-28.
 */
public class CombinationWithRepetitionsGenerator {

    public static void print(String str, int expectedLength) {
        if (str == null) {
            throw new IllegalArgumentException("Argument cannot be null!");
        }
        System.out.println(Arrays.toString(generate(str, expectedLength).toArray()));
    }

    public static HashSet<String> generate (String str, int expectedLength) {
        if (str == null) {
            throw new IllegalArgumentException("Argument cannot be null!");
        }
        HashSet<String> result = new HashSet<>();
        construct(result, "", str, expectedLength);
        return result;
    }


    private static void construct(HashSet<String> result, String prefix, String str, int expectedLength) {
        if (result == null || prefix == null || str == null) {
            throw new IllegalArgumentException("Argument cannot be null!");
        }
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
