package problems.primes;

import org.junit.Test;
import problems.primes.SumPrimes;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class SumPrimesTests {

    @Test(expected = IllegalArgumentException.class)
    public void lowerBoundTooLow() {
        SumPrimes.sum(1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void lowerBoundEqualsUpperBound() {
        SumPrimes.sum(2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void lowerBoundMoreThanUpperBound() {
        SumPrimes.sum(3, 2);
    }

    @Test
    public void sum2To3() {
        assertEquals(5, SumPrimes.sum(2, 3));
    }

    @Test
    public void sum2To13() {
        assertEquals(41, SumPrimes.sum(2, 13));
    }

    @Test
    public void sum3To13() {
        assertEquals(39, SumPrimes.sum(3, 13));
    }

    @Test
    public void sum9To13() {
        assertEquals(24, SumPrimes.sum(9, 13));
    }
    
}
