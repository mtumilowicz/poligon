package problems.primes;

import org.junit.Test;
import problems.primes.CountPrimes;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class CountPrimesTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void lowerBoundTooLow() {
        CountPrimes.count(1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void lowerBoundEqualsUpperBound() {
        CountPrimes.count(2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void lowerBoundMoreThanUpperBound() {
        CountPrimes.count(3, 2);
    }

    @Test
    public void count2To3() {
        assertEquals(2, CountPrimes.count(2, 3));
    }

    @Test
    public void count2To13() {
        assertEquals(6, CountPrimes.count(2, 13));
    }

    @Test
    public void count3To13() {
        assertEquals(5, CountPrimes.count(3, 13));
    }

    @Test
    public void count9To13() {
        assertEquals(2, CountPrimes.count(9, 13));
    }
    
}
