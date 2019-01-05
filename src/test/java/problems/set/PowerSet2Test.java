package problems.set;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2019-01-05.
 */
public class PowerSet2Test {

    @Test
    public void generate() {
        int size = 5;

        Set<String> powerset = PowerSet2.generate(size);

        assertEquals(powerset.size(), Math.pow(2, size), 0.0);
    }
}