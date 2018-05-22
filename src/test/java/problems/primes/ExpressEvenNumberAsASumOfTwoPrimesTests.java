package problems.primes;

import org.junit.Test;
import problems.primes.ExpressEvenNumberAsASumOfTwoPrimes;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class ExpressEvenNumberAsASumOfTwoPrimesTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void odd_argument() {
        ExpressEvenNumberAsASumOfTwoPrimes.express(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void two_argument() {
        ExpressEvenNumberAsASumOfTwoPrimes.express(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void one_argument() {
        ExpressEvenNumberAsASumOfTwoPrimes.express(1);
    }

    @Test
    public void argument_1233482() {
        assertEquals("1233482=43+1233439",ExpressEvenNumberAsASumOfTwoPrimes.express(1233482));
    }
}
