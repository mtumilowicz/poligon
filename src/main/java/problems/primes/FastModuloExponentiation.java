package problems.primes;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
final class FastModuloExponentiation {
    static long expo(int base, int exponent, int modulus) {
        Preconditions.checkArgument(base > 0);
        Preconditions.checkArgument(exponent > 0);
        Preconditions.checkArgument(modulus >= 2);
        
        long result = 1;
        long longBase = base;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * longBase) % modulus;
            }
            longBase = (longBase * longBase) % modulus;
            
            exponent = exponent >> 1;
        }

        return result;
    }
}
