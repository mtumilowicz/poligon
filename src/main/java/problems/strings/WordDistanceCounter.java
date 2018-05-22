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
        int currentDistanceOfIndexFromW1 = -1;
        int currentDistanceOfIndexFromW2 = -1;
        int d  = -1;

        for (String word : input.split("\\s+")) {
            if (Objects.equals(word, w1))
                currentDistanceOfIndexFromW1 = 0;
            if (Objects.equals(word, w2))
                currentDistanceOfIndexFromW2 = 0;

            if (wordWasEverFound(currentDistanceOfIndexFromW1) && wordWasEverFound(currentDistanceOfIndexFromW2)) {
                int currentDistance = Math.abs(currentDistanceOfIndexFromW1 - currentDistanceOfIndexFromW2);
                d = d == -1 ? currentDistance : min(d, currentDistance);
            }

            if (!Objects.equals(word, w1) && !Objects.equals(word, w2)) {
                if (currentDistanceOfIndexFromW1 != -1) currentDistanceOfIndexFromW1++;
                if (currentDistanceOfIndexFromW2 != -1) currentDistanceOfIndexFromW2++;
            }
        }
        return d;
    }
    
    private boolean wordWasEverFound (int currentDistanceOfIndexFromW1) {
        return currentDistanceOfIndexFromW1 != -1;
    }
}