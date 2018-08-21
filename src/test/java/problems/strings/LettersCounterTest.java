package problems.strings;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-08-21.
 */
public class LettersCounterTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullInput() {
        LettersCounter.count(null);
    }

    @Test
    public void singleElem() {
//        given
        String str = "a";
//        when
        Map<String, Long> counter = LettersCounter.count(str);
//        then
        assertThat(1L, is(counter.get(str)));
    }

    @Test
    public void two_diff_Elem() {
//        when
        Map<String, Long> counter = LettersCounter.count("ab");
        
//        then
        assertThat(1L, is(counter.get("a")));
        assertThat(1L, is(counter.get("b")));
    }

    @Test
    public void two_same_Elem() {
//        when
        Map<String, Long> counter = LettersCounter.count("aa");

//        then
        assertThat(2L, is(counter.get("a")));
    }

    @Test
    public void two_same_one_diff_Elem() {
//        when
        Map<String, Long> counter = LettersCounter.count("aba");

//        then
        assertThat(2L, is(counter.get("a")));
        assertThat(1L, is(counter.get("b")));
    }

    @Test
    public void mix() {
//        when
        Map<String, Long> counter = LettersCounter.count("ababaaacadeff");

//        then
        assertThat(6L, is(counter.get("a")));
        assertThat(2L, is(counter.get("b")));
        assertThat(1L, is(counter.get("c")));
        assertThat(1L, is(counter.get("d")));
        assertThat(1L, is(counter.get("e")));
        assertThat(2L, is(counter.get("f")));
    }
}