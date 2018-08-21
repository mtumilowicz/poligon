package problems.strings;

import com.google.common.base.Preconditions;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-08-21.
 */
final class PermutationGenerator {
    static Set<String> generate(String string) {
        Preconditions.checkArgument(nonNull(string));
        
        Set<String> result = new HashSet<>();
        permutations("", string, result);
        return result;
    }
    
    // left side of a valid permutation + remaining characters
    private static void permutations(String prefix, String letters, Set<String> result) {
        if (letters.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < letters.length(); i++) {
                String letter = Character.toString(letters.charAt(i));
                String otherLetters = letters.substring(0, i) + letters.substring(i + 1);
                permutations(prefix + letter, otherLetters, result);
            }
        }
    }
}
