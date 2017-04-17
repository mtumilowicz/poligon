package utils;

import com.google.common.base.Preconditions;
import com.google.common.math.BigIntegerMath;

/**
 * Created by mtumilowicz on 2017-03-29.
 */
public class CatalanNumberGenerator {

    public static int get(int n) {
        Preconditions.checkArgument(n < 50);
        return (BigIntegerMath.binomial(2*n, n).intValue())/(n+1);
    }
}
