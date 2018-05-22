package dates;

import org.junit.Test;
import utils.DateUtil;

import java.util.Date;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DateUtilTests {
    
    @Test
    public void maxTwoNulls() {
        assertNull(DateUtil.max(null, null));
    }

    @Test
    public void maxFirstNull() {
        assertNull(DateUtil.max(null, new Date()));
    }

    @Test
    public void maxSecondNull() {
        assertNull(DateUtil.max(new Date(), null));
    }
    
    @Test
    public void maxFirstAfterSecond() {
        Date first = new Date(2);
        Date second = new Date(1);
        assertEquals(first, DateUtil.max(first, second));
    }

    @Test
    public void maxFirstBeforeSecond() {
        Date first = new Date(1);
        Date second = new Date(2);
        assertEquals(second, DateUtil.max(first, second));
    }

    @Test
    public void maxSecondAfterFirst() {
        Date first = new Date(1);
        Date second = new Date(2);
        assertEquals(second, DateUtil.max(first, second));
    }

    @Test
    public void maxSecondBeforeFirst() {
        Date first = new Date(2);
        Date second = new Date(1);
        assertEquals(first, DateUtil.max(first, second));
    }
}
