package problems.primes;

import com.google.common.base.Preconditions;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class Sieve {
    
    public static boolean[] boolSieve(int upperBound) {
        Preconditions.checkArgument(upperBound > 1);
        boolean[] isPrime = new boolean[upperBound + 1];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int m = 2; m <= (int) Math.sqrt(upperBound); m++) {
            if (isPrime[m]) {
                for (int k = m * m; k <= upperBound; k += m)
                    isPrime[k] = false;
            }
        }
        return isPrime;
    }
}
