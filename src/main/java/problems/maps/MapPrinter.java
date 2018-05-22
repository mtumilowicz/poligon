package problems.maps;

import com.google.common.base.Preconditions;

import java.util.Map;

/**
 * Created by mtumilowicz on 2017-04-25.
 */
public class MapPrinter {

    public static <K, V> void printOrdered(Map<K, V> map) {
        Preconditions.checkArgument(map != null);
        
        map.entrySet().stream().forEachOrdered(System.out::println);
    }

    public static <K, V> void printOrdered(Map<K, V> map, int limit) {
        Preconditions.checkArgument(map != null);
        Preconditions.checkArgument(limit > 0);
        
        map.entrySet().stream().limit(limit).forEachOrdered(System.out::println);
    }

    public static <K, V> void print(Map<K, V> map) {
        Preconditions.checkArgument(map != null);
        
        map.entrySet().stream().forEach(System.out::println);
    }

    public static <K, V> void print(Map<K, V> map, int limit) {
        Preconditions.checkArgument(map != null);
        
        map.entrySet().stream().limit(limit).forEach(System.out::println);
    }
}
