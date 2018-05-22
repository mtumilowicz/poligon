package problems.duplicates;

import com.google.common.base.Preconditions;
import org.junit.Test;
import problems.duplicates.DuplicatesRemover;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public abstract class DuplicatesRemoverTests<E> {
    
    public abstract List<E> getSingleElementList();
    public abstract List<E> getTwoEqualsElementsListOfLengthTwo();
    public abstract List<E> getList();
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTest() {
        DuplicatesRemover.<E>remove(null);
    }
    
    @Test
    public void singleElementList() {
        test(getSingleElementList());
    }
    
    @Test
    public void twoEqualsElementsListOfLengthTwo() {
        test(getTwoEqualsElementsListOfLengthTwo());
    }
    
    @Test
    public void list() {
        test(getList());
    }
    
    private void test(List<E> list) {
        Preconditions.checkArgument(list != null);
        assertEquals(new LinkedList<>(new LinkedHashSet<>(list)), DuplicatesRemover.remove(list));
    }
    
}
