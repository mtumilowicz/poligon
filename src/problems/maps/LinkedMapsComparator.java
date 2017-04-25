package problems.maps;

import com.google.common.base.Preconditions;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-04-25.
 */
public class LinkedMapsComparator {
    public static <K, V> boolean equals(LinkedHashMap<K, V> map1, LinkedHashMap<K, V> map2) {
        Preconditions.checkArgument(map1 != null);
        Preconditions.checkArgument(map2 != null);
        
        LinkedList<Map.Entry<K, V>> entrySetMap1 = new LinkedList<>(map1.entrySet());
        LinkedList<Map.Entry<K, V>> entrySetMap2 = new LinkedList<>(map2.entrySet());
        LinkedList<K> keySetMap1 = new LinkedList<>(map1.keySet());
        LinkedList<K> keySetMap2 = new LinkedList<>(map2.keySet());
        
        return map1.size() == map2.size() && 
                Objects.equals(entrySetMap1, entrySetMap2) && 
                Objects.equals(keySetMap1, keySetMap2);
    } 
}
