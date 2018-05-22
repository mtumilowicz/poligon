package problems.maps;

import org.apache.commons.collections4.MapUtils;
import org.junit.Test;
import problems.maps.LinkedMapsComparator;
import problems.maps.MapSorter;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2017-04-25.
 */
public class MapSorterTests {

    @Test
    public void sortWithDefaultOrderNullCheck() {
        assertEquals(MapUtils.EMPTY_SORTED_MAP, MapSorter.sortByValueWithDefaultOrder(null));
    }
    
    @Test
    public void sortWithDefaultOrderOneElement() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        assertEquals(map, MapSorter.sortByValueWithDefaultOrder(map));
    }

    @Test
    public void sortWithDefaultOrder1_2() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        assertTrue(LinkedMapsComparator.equals(MapSorter.sortByValueWithDefaultOrder(map), map));
    }

    @Test
    public void sortWithDefaultOrder2_1NotEquals() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("2", 2);
        map.put("1", 1);
        assertFalse(LinkedMapsComparator.equals(MapSorter.sortByValueWithDefaultOrder(map), map));
    }

    @Test
    public void sortWithDefaultOrder2_1() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("2", 2);
        map.put("1", 1);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        sortedMap.put("1", 1);
        sortedMap.put("2", 2);
        
        assertTrue(LinkedMapsComparator.equals(MapSorter.sortByValueWithDefaultOrder(map), sortedMap));
    }

    @Test
    public void sortWithDefaultOrder3_2_1() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("3", 3);
        map.put("2", 2);
        map.put("1", 1);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        sortedMap.put("1", 1);
        sortedMap.put("2", 2);
        sortedMap.put("3", 3);
        
        assertTrue(LinkedMapsComparator.equals(MapSorter.sortByValueWithDefaultOrder(map), sortedMap));
    }
}
