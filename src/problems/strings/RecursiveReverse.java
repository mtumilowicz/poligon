package problems.strings;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by mtumilowicz on 2017-10-09.
 */
public class RecursiveReverse {
    public static String reverse(String string) {
        string = StringUtils.defaultIfEmpty(string, StringUtils.EMPTY);
        if (StringUtils.isEmpty(string)) {
            return StringUtils.EMPTY;
        }
        return reverse(string.substring(1)) + string.charAt(0);
    }
}
