package problems.set;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;

/**
 * Created by mtumilowicz on 2018-06-10.
 */
public class PowerSetTest {
    
    private static String a = "a";
    private static String b = "b";
    private static String c = "c";

    @Test
    public void nullArgument() {
        HashSet<HashSet<String>> expected = new HashSet<>();
        expected.add(new HashSet<>());
        Assert.assertEquals(expected, PowerSet.of(null));
    }

    @Test
    public void oneElementSetAssertNotEquals() {
        HashSet<HashSet<String>> expected = new HashSet<>();
        expected.add(new HashSet<>());
        expected.add(new HashSet<>(Collections.singletonList(a)));
        expected.add(new HashSet<>(Collections.singletonList(b)));

        Assert.assertNotEquals(expected, PowerSet.of(new HashSet<>(Collections.singletonList(a))));
    }

    @Test
    public void oneElementSet() {
        HashSet<HashSet<String>> expected = new HashSet<>();
        expected.add(new HashSet<>());
        expected.add(new HashSet<>(Collections.singletonList(a)));
        
        Assert.assertEquals(expected, PowerSet.of(new HashSet<>(Collections.singletonList(a))));
    }

    @Test
    public void twoElementSet() {
        HashSet<HashSet<String>> expected = new HashSet<>();
        expected.add(new HashSet<>());
        expected.add(new HashSet<>(Collections.singletonList(a)));
        expected.add(new HashSet<>(Collections.singletonList(b)));
        expected.add(new HashSet<>(ImmutableList.of(a, b)));

        Assert.assertEquals(expected, PowerSet.of(new HashSet<>(ImmutableList.of(a, b))));
    }

    @Test
    public void threeElementSet() {
        HashSet<HashSet<String>> expected = new HashSet<>();
        expected.add(new HashSet<>());
        expected.add(new HashSet<>(Collections.singletonList(a)));
        expected.add(new HashSet<>(Collections.singletonList(b)));
        expected.add(new HashSet<>(Collections.singletonList(c)));
        expected.add(new HashSet<>(ImmutableList.of(a, c)));
        expected.add(new HashSet<>(ImmutableList.of(a, b)));
        expected.add(new HashSet<>(ImmutableList.of(b, c)));
        expected.add(new HashSet<>(ImmutableList.of(a, b, c)));

        Assert.assertEquals(expected, PowerSet.of(new HashSet<>(ImmutableList.of(a, b, c))));
    }
}