package problems.strings;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-08-27.
 */
final class LengthCountWordsMapper {
    static Map<Integer, Long> count(List<String> strings) {
        Preconditions.checkArgument(nonNull(strings));
        return strings.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }
}
