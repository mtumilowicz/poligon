package dates;

import org.junit.Test;
import problems.dates.DateGenerator;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DateGeneratorTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        DateGenerator.generateAfter(null);
    }
}
