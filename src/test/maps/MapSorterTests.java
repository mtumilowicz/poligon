package test.maps;

import org.junit.Test;
import problems.maps.LinkedMapsComparator;
import problems.maps.MapPrinter;
import problems.maps.MapSorter;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2017-04-25.
 */
public class MapSorterTests {
    
    @Test(expected = IllegalArgumentException.class)
    public void sortWithDefaultOrderNullCheck() {
        MapSorter.sortWithDefaultOrder(null);
    }
    
    @Test
    public void sortWithDefaultOrderOneElement() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        assertEquals(MapSorter.sortWithDefaultOrder(map), map);
    }

    @Test
    public void sortWithDefaultOrder1_2() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        assertTrue(LinkedMapsComparator.equals(MapSorter.sortWithDefaultOrder(map), map));
    }

    @Test
    public void sortWithDefaultOrder2_1NotEquals() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("2", 2);
        map.put("1", 1);
        assertFalse(LinkedMapsComparator.equals(MapSorter.sortWithDefaultOrder(map), map));
    }

    @Test
    public void sortWithDefaultOrder2_1() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("2", 2);
        map.put("1", 1);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        sortedMap.put("1", 1);
        sortedMap.put("2", 2);
        
        assertTrue(LinkedMapsComparator.equals(MapSorter.sortWithDefaultOrder(map), sortedMap));
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

        MapPrinter.printOrdered(MapSorter.sortWithDefaultOrder(map));
        assertTrue(LinkedMapsComparator.equals(MapSorter.sortWithDefaultOrder(map), sortedMap));
    }
}
