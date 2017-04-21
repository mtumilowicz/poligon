package problems.primes;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class SumPrimes {

    private static int[] sieveSum = null;

    public static int sum(int lowerBound, int upperBound) {
        Preconditions.checkArgument(lowerBound > 1);
        Preconditions.checkArgument(upperBound > lowerBound);
        Preconditions.checkArgument(upperBound < 100);
        if (sieveSum == null || sieveSum.length < upperBound) {
            reloadSieveSum(upperBound);
        }
        return sieveSum[upperBound] - sieveSum[lowerBound-1];
    }

    private static void reloadSieveSum(int upperBound) {
        Preconditions.checkArgument(upperBound > 2);
        sieveSum = new int[upperBound + 1];
        int counter = 0;
        boolean[] isPrime = Sieve.boolSieve(upperBound);
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                counter=counter+i;
            }
            sieveSum[i]=counter;
        }
    }
}
