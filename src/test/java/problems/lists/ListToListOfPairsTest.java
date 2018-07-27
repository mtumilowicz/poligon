package problems.lists;

import org.junit.Test;

import java.util.Collections;

/**
 * Created by mtumilowicz on 2018-07-27.
 */
public class ListToListOfPairsTest {

    @Test(expected = IllegalArgumentException.class)
    public void convert_oddSizeList() {
        ListToListOfPairs.convert(Collections.singletonList(1));
    }
}