package interviewquestions;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class BalancedBracketsGrouper {

    public static void print(String s) {
        Objects.requireNonNull(s);
        Set<String> group = group(s);
        System.out.println(Arrays.toString(group.toArray()));
    }

    public static Set<String> group(String string) {
        Objects.requireNonNull(string);
        HashSet<String> groupedInBalancedBrackets = new HashSet<>();
        Set<String> brackets = BalancedBracketsGenerator.generate(string.length());
        for (String bracket : brackets) {
            groupedInBalancedBrackets.add(shuffleWithBrackets(string, bracket));
        }

        return groupedInBalancedBrackets;
    }

    private static String shuffleWithBrackets(String string, String brackets) {
        Objects.requireNonNull(string);
        Objects.requireNonNull(brackets);

        Preconditions.checkArgument(brackets.matches("^[()]+$"));
        Preconditions.checkArgument(string.length() == (brackets.length() / 2), "Incorrect number of brackets.");

        StringBuilder shuffled = new StringBuilder();
        int j=0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                shuffled.append(brackets.charAt(i));
                shuffled.append(string.charAt(j++));
            } else {
                shuffled.append(brackets.charAt(i));
            }
        }

        return shuffled.toString();
    }
}
