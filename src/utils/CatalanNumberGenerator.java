package utils;

import com.google.common.math.BigIntegerMath;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class CatalanNumberGenerator {

    public static int get(int n) {
        if (n > 50) {
            throw new IllegalArgumentException("Argument should be less or equal to 10.");
        }
        return (BigIntegerMath.binomial(2*n, n).intValue())/(n+1);
    }
}
