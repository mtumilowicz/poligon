package problems.strings;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static problems.strings.ListOfStringsToCommaSeparatedString.usingCollectors;
import static problems.strings.ListOfStringsToCommaSeparatedString.usingReduce;
import static problems.strings.ListOfStringsToCommaSeparatedString.usingStringJoin;

/**
 * Created by mtumilowicz on 2018-10-12.
 */
public class ListOfStringsToCommaSeparatedStringTest {

    @Test
    public void usingCollectors_0() {
        assertThat(usingCollectors(Collections.emptyList()), is(""));
    }

    @Test
    public void usingCollectors_1() {
        assertThat(usingCollectors(Collections.singletonList("a")), is("a"));
    }

    @Test
    public void usingCollectors_3() {
        assertThat(usingCollectors(Arrays.asList("a", "b", "c")), is("a,b,c"));
    }

    @Test
    public void usingStringJoin_0() {
        assertThat(usingStringJoin(Collections.emptyList()), is(""));
    }

    @Test
    public void usingStringJoin_1() {
        assertThat(usingStringJoin(Collections.singletonList("a")), is("a"));
    }

    @Test
    public void usingStringJoin_3() {
        assertThat(usingStringJoin(Arrays.asList("a", "b", "c")), is("a,b,c"));
    }

    @Test
    public void usingReduceTest_0() {
        assertFalse(usingReduce(Collections.emptyList()).isPresent());
    }

    @Test
    public void usingReduceTest_1() {
        assertThat(usingReduce(Collections.singletonList("a")).get(), is("a"));
    }

    @Test
    public void usingReduceTest_2() {
        assertThat(usingReduce(Arrays.asList("a", "b")).get(), is("a,b"));
    }

    @Test
    public void usingReduceTest_3() {
        assertThat(usingReduce(Arrays.asList("a", "b", "c")).get(), is("a,b,c"));
    }
}