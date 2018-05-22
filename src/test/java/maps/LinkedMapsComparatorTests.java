package maps;

import org.junit.Test;
import problems.maps.LinkedMapsComparator;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2017-04-25.
 */
public class LinkedMapsComparatorTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void equalsFirstArgNull() {
        LinkedMapsComparator.equals(null, new LinkedHashMap<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void equalsSecondArgNull() {
        LinkedMapsComparator.equals(new LinkedHashMap<>(), null);
    }

    @Test
    public void equalsEmptyLinkedMaps() {
        assertTrue(LinkedMapsComparator.equals(new LinkedHashMap<>(), new LinkedHashMap<>()));
    }

    @Test
    public void notEquals_EmptyF_1S() {
        LinkedHashMap<String, Integer> _1 = new LinkedHashMap<>();
        _1.put("1", 1);
        assertFalse(LinkedMapsComparator.equals(new LinkedHashMap<>(), _1));
    }

    @Test
    public void equals_2F_2S() {
        LinkedHashMap<String, Integer> _2F = new LinkedHashMap<>();
        _2F.put("1", 1);
        _2F.put("2", 2);

        LinkedHashMap<String, Integer> _2S = new LinkedHashMap<>();
        _2S.put("1", 1);
        _2S.put("2", 2);
        assertTrue(LinkedMapsComparator.equals(_2F, _2S));
    }

    @Test
    public void notEquals_2F_2S() {
        LinkedHashMap<String, Integer> _2F = new LinkedHashMap<>();
        _2F.put("2", 2);
        _2F.put("1", 1);

        LinkedHashMap<String, Integer> _2S = new LinkedHashMap<>();
        _2S.put("1", 1);
        _2S.put("2", 2);
        assertFalse(LinkedMapsComparator.equals(_2F, _2S));
    }
}
