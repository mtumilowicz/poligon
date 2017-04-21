package problems.duplicates;

import com.google.common.base.Preconditions;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-04-20.
 */
public class DuplicatesRemover<E> {
    public static <E> List<E> remove(List<E> list) {
        Preconditions.checkArgument(list != null);
        return new LinkedList<>(new LinkedHashSet<>(list));
    }
}
