package problems.brackets;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-04-06.
 */
public class TwoArgumentBracketsGrouper {

    public static void print(String s) {
        Objects.requireNonNull(s);
        System.out.println(Arrays.toString(TwoArgumentBracketsGrouper.generate(s).toArray()));
    }

    public static List<String> generate(String s) {
        Objects.requireNonNull(s);
        if(s.length() == 1) {
            return new LinkedList<>(Arrays.asList(s));
        }
        return construct(s);
    }

    private static List<String> construct(String s) {
        Objects.requireNonNull(s);

        if(s.length() == 1) {
            return new LinkedList<>(Arrays.asList(s));
        }

        List<String> results = new LinkedList<>();

        for (int i = 1; i < s.length(); i++) {
            List<String> r1 = construct(s.substring(0, i));
            List<String> r2 = construct(s.substring(i));
            for (String s1 : r1) {
                for (String s2 : r2) {
                    String r = "(" + s1 + s2 + ")";
                    results.add(r);
                }
            }
        }
        return results;
    }
}
