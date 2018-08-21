package problems.strings;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-08-21.
 */
final class LettersCounter {
    static Map<String, Long> count(String string) {
        Preconditions.checkArgument(nonNull(string));
        
        return Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
