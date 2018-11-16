package problems.primes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
public class FastModuloExponentiationTest {

    @Test
    public void expo_5_3_547() {
        assertEquals(125, 
                FastModuloExponentiation.expo(5,3,547));
    }
    
    @Test
    public void expo_6_20_13() {
        assertEquals(3, 
                FastModuloExponentiation.expo(6, 20, 13));
    }

    @Test
    public void expo_8_200000_179426453() {
        assertEquals(46472984, 
                FastModuloExponentiation.expo(8,200000,179426453));
    }

    @Test
    public void expo_875_22343452_15487237() {
        assertEquals(15251865, 
                FastModuloExponentiation.expo(875,22343452,15487237));
    }
}