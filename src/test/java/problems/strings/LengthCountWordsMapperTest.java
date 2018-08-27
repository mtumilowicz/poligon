package problems.strings;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mtumilowicz on 2018-08-27.
 */
public class LengthCountWordsMapperTest {

    @Test(expected = IllegalArgumentException.class)
    public void count() {
        LengthCountWordsMapper.count(null);
    }

    @Test
    public void oneWord() {
        assertThat(LengthCountWordsMapper.count(Collections.singletonList("a")).get(1), is(1L));
    }

    @Test
    public void twoSameWords() {
        assertThat(LengthCountWordsMapper.count(Arrays.asList("a", "a")).get(1), is(2L));
    }

    @Test
    public void twoDifferentWords() {
        assertThat(LengthCountWordsMapper.count(Arrays.asList("a", "b")).get(1), is(2L));
    }

    @Test
    public void twoDifferentLengthWords() {
        Map<Integer, Long> count = LengthCountWordsMapper.count(Arrays.asList("aa", "b"));
        assertThat(count.get(1), is(1L));
        assertThat(count.get(2), is(1L));
    }

    @Test
    public void mix() {
        Map<Integer, Long> count = LengthCountWordsMapper.count(Arrays.asList(
                "a", 
                "b",
                "cde",
                "be",
                "ed",
                "edd",
                "ede",
                "add",
                "avder",
                "ddd"));
        assertThat(count.get(1), is(2L));
        assertThat(count.get(2), is(2L));
        assertThat(count.get(3), is(5L));
        assertThat(count.get(5), is(1L));
    }
}