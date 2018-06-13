package problems.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by mtumilowicz on 2018-06-12.
 */
public class AllContinuousSublistsTest {

    static final String a = "a";
    static final String b = "b";
    static final String c = "c";

    @Test
    public void firstSolution_nullList() {
        List<Object> objects = new LinkedList<>();
        objects.add(Collections.emptyList());

        Assert.assertEquals(objects,
                AllContinuousSublists.firstSolution(null).collect(toList()));
    }

    @Test
    public void secondSolution_nullList() {
        List<Object> objects = new LinkedList<>();
        objects.add(Collections.emptyList());

        Assert.assertEquals(objects,
                AllContinuousSublists.secondSolution(null).collect(toList()));
    }

    @Test
    public void firstSolution_oneElemList() {
        Set<List<String>> strings = new HashSet<>();
        strings.add(Collections.emptyList());
        strings.add(Arrays.asList(a));

        Assert.assertEquals(strings,
                AllContinuousSublists.firstSolution(Arrays.asList(a)).collect(Collectors.toSet()));
    }

    @Test
    public void secondSolution_oneElemList() {
        Set<List<String>> strings = new HashSet<>();
        strings.add(Collections.emptyList());
        strings.add(Arrays.asList(a));

        Assert.assertEquals(strings,
                AllContinuousSublists.firstSolution(Arrays.asList(a)).collect(Collectors.toSet()));
    }

    @Test
    public void firstSolution_threeElemList() {
        Set<List<String>> strings = new HashSet<>();
        strings.add(Collections.emptyList());
        strings.add(Arrays.asList(a));
        strings.add(Arrays.asList(a, b));
        strings.add(Arrays.asList(a, b, c));
        strings.add(Arrays.asList(b));
        strings.add(Arrays.asList(b, c));
        strings.add(Arrays.asList(c));

        Assert.assertEquals(strings,
                AllContinuousSublists.firstSolution(Arrays.asList(a, b, c)).collect(Collectors.toSet()));
    }

    @Test
    public void secondSolution_threeElemList() {
        Set<List<String>> strings = new HashSet<>();
        strings.add(Collections.emptyList());
        strings.add(Arrays.asList(a));
        strings.add(Arrays.asList(a, b));
        strings.add(Arrays.asList(a, b, c));
        strings.add(Arrays.asList(b));
        strings.add(Arrays.asList(b, c));
        strings.add(Arrays.asList(c));

        Assert.assertEquals(strings,
                AllContinuousSublists.secondSolution(Arrays.asList(a, b, c)).collect(Collectors.toSet()));
    }
}