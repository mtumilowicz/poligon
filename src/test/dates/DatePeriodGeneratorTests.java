package test.dates;

import org.junit.Test;
import problems.dates.DatePeriodGenerator;

import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodGeneratorTests {
    
    @Test
    public void testZeroNotNull() {
        assertTrue(DatePeriodGenerator.generate(0) != null);
    }
    
    @Test
    public void testZeroEmpty() {
        assertTrue(DatePeriodGenerator.generate(0).size() == 0);
    }
    
    @Test
    public void severalPrimaryCases() {
        for (int i = 0; i < 10; i++){
            assertTrue(DatePeriodGenerator.generate(i).size() == i);
        }
    }
}
