package problems.primes;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class ExpressEvenNumberAsASumOfTwoPrimes {
    public static String express(int even) {
        Preconditions.checkArgument(even % 2 == 0 && even > 2);
        boolean[] sieve = Sieve.boolSieve(even);

        for (int i = 2; i < sieve.length / 2 + 1; i++) {
            if (sieve[i] && sieve[even - i]) {
                return even + "=" + i + "+" + (even - i);
            }
        }
        throw new IllegalStateException("Goldbach's conjecture!");
    }
}
