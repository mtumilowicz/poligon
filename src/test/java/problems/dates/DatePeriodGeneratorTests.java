package problems.dates;

import org.junit.Test;
import problems.dates.DatePeriodGenerator;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DatePeriodGeneratorTests {
    
    @Test
    public void testZeroNotNull() {
        assertNotNull(DatePeriodGenerator.generate(0));
    }
    
    @Test
    public void testZeroEmpty() {
        assertEquals(0, DatePeriodGenerator.generate(0).size());
    }
    
    @Test
    public void severalPrimaryCases() {
        for (int i = 0; i < 10; i++){
            assertEquals(DatePeriodGenerator.generate(i).size(), i);
        }
    }
}
