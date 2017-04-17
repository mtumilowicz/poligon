package test;

import org.junit.Test;
import utils.CombinationWithRepetitionsGenerator;

/**
 * Created by mtumilowicz on 2017-04-17.
 */
public class CombinationWithRepetitionsGeneratorTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        CombinationWithRepetitionsGenerator.generate(null, 5);
    }
}
