package problems.lists;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Created by mtumilowicz on 2017-06-18.
 */
public class ListPrinter {
    public static <E> void print(List<E> list) {
        Preconditions.checkArgument(list != null);
        
        list.stream().forEachOrdered(System.out::println);
    }
}
