package problems.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mtumilowicz on 2018-07-27.
 */
public class ListToListOfPairsTest {

    @Test
    public void convert_null() {
        ListToListOfPairs.convert(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_oddSizeList() {
        ListToListOfPairs.convert(Collections.singletonList(1));
    }

    @Test
    public void convert_2Elem() {
//        given
        List<Integer> integers = Arrays.asList(1, 2);
        
//        and
        List<Pair> expectedIntegerPairs = Collections.singletonList(new Pair(1, 2));
        
//        expect
        Assert.assertEquals(expectedIntegerPairs, ListToListOfPairs.convert(integers));
    }

    @Test
    public void convert_4Elem() {
//        given
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

//        and
        List<Pair> expectedIntegerPairs = Arrays.asList(new Pair(1, 2), new Pair(3, 4));

//        expect
        Assert.assertEquals(expectedIntegerPairs, ListToListOfPairs.convert(integers));
    }

    @Test
    public void convert_6Elem() {
//        given
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

//        and
        List<Pair> expectedIntegerPairs = Arrays.asList(new Pair(1, 2), new Pair(3, 4), new Pair(5, 6));

//        expect
        Assert.assertEquals(expectedIntegerPairs, ListToListOfPairs.convert(integers));
    }
}