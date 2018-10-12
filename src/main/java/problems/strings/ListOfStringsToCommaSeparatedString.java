package problems.strings;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2018-10-12.
 */
final class ListOfStringsToCommaSeparatedString {
    
    static String usingStringJoin(List<String> strings) {
        return String.join(",", strings);
    }
    
    static String usingCollectors(List<String> strings) {
        return strings.stream().collect(Collectors.joining(","));
    }

    static Optional<String> usingReduce(List<String> strings) {
        return strings.stream().reduce((first, second) -> first + "," + second);
    }
}
