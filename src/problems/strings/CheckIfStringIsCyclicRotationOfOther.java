package problems.strings;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class CheckIfStringIsCyclicRotationOfOther {
    public static boolean check(String first, String second) {
        if (first == null && second != null || first != null && second == null) {
            return false;
        }
        first = StringUtils.defaultIfEmpty(first, "");
        second = StringUtils.defaultIfEmpty(second, "");
        return StringUtils.contains(
                StringUtils.join(first, first),
                second);
    }
}
