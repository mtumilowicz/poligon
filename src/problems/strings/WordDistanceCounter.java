package problems.strings;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static java.lang.Integer.min;

/**
 * Created by mtumilowicz on 2017-09-16.
 */
public class WordDistanceCounter {
    private final String input;

    public WordDistanceCounter(String input) {
        this.input = StringUtils.defaultIfEmpty(input.replaceAll("[.,]",""),"");
    }

    public int distance(String w1, String w2) {
        int p1 = -1;
        int p2 = -1;
        int d  = -1;

        for (String word : input.split("\\s+")) {
            if (Objects.equals(word, w1))
                p1 = 0;
            if (Objects.equals(word, w2))
                p2 = 0;

            if (p1 != -1 && p2 != -1) {
                int currentDistance = Math.abs(p1 - p2);
                d = d == -1 ? currentDistance : min(d, currentDistance);
            }

            if (!Objects.equals(word, w1) && !Objects.equals(word, w2)) {
                if (p1 != -1) p1++;
                if (p2 != -1) p2++;
            }
        }
        return d;
    }
}