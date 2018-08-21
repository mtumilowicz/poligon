package problems.strings;

import com.google.common.base.Preconditions;
import lombok.NonNull;

import java.util.Map;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-08-21.
 */
final class CheckIfTwoStringsAreAnagrams {
    static boolean check(@NonNull String first, @NonNull String second) {
        Preconditions.checkArgument(nonNull(first));
        Preconditions.checkArgument(nonNull(second));
        
        Map<String, Long> firstCounted = LettersCounter.count(first);
        Map<String, Long> secondCounted = LettersCounter.count(second);
        
        secondCounted.forEach((string, counter) -> 
                firstCounted.merge(string, counter, (x, y) -> x - y)
                );

        return firstCounted.values().stream().allMatch(value -> value == 0);
    }
}
