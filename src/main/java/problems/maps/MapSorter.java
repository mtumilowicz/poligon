package problems.maps;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.MapUtils;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-04-25.
 */
public class MapSorter {
    
    private static <K, V extends Comparable<V>> LinkedHashMap<K, V> sort(Map<K, V> map,
                                                                         Comparator<? super Entry<K, V>> comparator) {
        Preconditions.checkArgument(comparator != null);
        
        return MapUtils.emptyIfNull(map).entrySet().stream()
                .sorted(comparator)
                .collect(Collectors.toMap(
                        Entry::getKey,
                        Entry::getValue,
                        (x,y)-> {throw new AssertionError();},
                        LinkedHashMap::new
                ));
    }

    public static <K, V  extends Comparable<V>> LinkedHashMap<K, V> sortByValueWithDefaultOrder(Map<K, V> map) {
        return sort(MapUtils.emptyIfNull(map), Entry.comparingByValue());
    }

    public static <K, V  extends Comparable<V>> LinkedHashMap<K, V> sortByValueWithReversedOrder(Map<K, V> map) {
        Preconditions.checkArgument(map != null);
        
        return sort(MapUtils.emptyIfNull(map), Entry.<K, V>comparingByValue().reversed());
    }
}
