package test.duplicates;

import org.junit.Test;
import problems.duplicates.FindMissingIntInShuffledArithmeticSequence;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-04-21.
 */
public class FindMissingIntInShuffledArithmeticSequenceTests {

    @Test
    public void base1diff2miss7() {
        assertEquals(7,
                FindMissingIntInShuffledArithmeticSequence.find(new int[]{1, 3, 5, 9, 11, 13, 15},1,2));
    }

    @Test
    public void base1diff1miss2() {
        assertEquals(2, 
                FindMissingIntInShuffledArithmeticSequence.find(new int[]{1, 3}, 1, 1));
    }

    @Test
    public void base1diff1miss3() {
        assertEquals(3, 
                FindMissingIntInShuffledArithmeticSequence.find(new int[]{1, 2, 4}, 1, 1));
    }

    @Test
    public void base1diff1miss5() {
        assertEquals(5, 
                FindMissingIntInShuffledArithmeticSequence.find(new int[]{1, 2, 3, 4, 6}, 1, 1));
    }

    @Test
    public void base1diff1missFirst() {
        assertEquals(1, 
                FindMissingIntInShuffledArithmeticSequence.find(new int[]{2, 3, 4, 5, 6, 7}, 1, 1));
    }

    @Test
    public void base1diff1missLast() {
        assertEquals(8, 
                FindMissingIntInShuffledArithmeticSequence.find(new int[]{1, 2, 3, 4, 5, 6, 7}, 1, 1));
    }
        
}
