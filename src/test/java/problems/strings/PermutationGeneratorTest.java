package problems.strings;

import com.google.common.math.IntMath;
import org.junit.Test;
import problems.strings.PermutationGenerator;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2018-08-21.
 */
public class PermutationGeneratorTest {

    @Test(expected = IllegalArgumentException.class)
    public void generate() {
        System.out.println(PermutationGenerator.generate(null));
    }

    @Test
    public void generate_1elem() {
        //        given
        String str = "a";

//        when
        Set<String> permutations = PermutationGenerator.generate(str);

//        then
        assertEquals(IntMath.factorial(str.length()), permutations.size());
        assertTrue(permutations.stream().allMatch(x -> x.length() == str.length()));
    }

    @Test
    public void generate_2elem() {
//        given
        String str = "ab";

//        when
        Set<String> permutations = PermutationGenerator.generate(str);

//        then
        assertEquals(IntMath.factorial(str.length()), permutations.size());
        assertTrue(permutations.stream().allMatch(x -> x.length() == str.length()));
    }

    @Test
    public void generate_3elem() {
//        given
        String str = "abc";

//        when
        Set<String> permutations = PermutationGenerator.generate(str);

//        then
        assertEquals(IntMath.factorial(str.length()), permutations.size());
        assertTrue(permutations.stream().allMatch(x -> x.length() == str.length()));
    }

    @Test
    public void generate_6elem() {
//        given
        String str = "abcdef";

//        when
        Set<String> permutations = PermutationGenerator.generate(str);

//        then
        assertEquals(IntMath.factorial(str.length()), permutations.size());
        assertTrue(permutations.stream().allMatch(x -> x.length() == str.length()));
    }

    @Test
    public void generate_3elem_duplicates() {
//        given
        String str = "aaa";

//        when
        Set<String> permutations = PermutationGenerator.generate(str);

//        then
        assertEquals(1, permutations.size());
        assertTrue(permutations.stream().allMatch(x -> x.length() == str.length()));
    }

    @Test
    public void generate_6elem_2LettersHaveDuplicates() {
//        given
        String str = "abcbaf";

//        when
        Set<String> permutations = PermutationGenerator.generate(str);

//        then
        /*
        if: C_1 == C_2 == C_3
        ABC_1C_2C_3EF  looks the same as ABC_2C_1EFC_3, so we have to divide all possible combinations 
        (7!) by all possible combinations of C_1C_2C_3 (3!)
        
        k: a1...ak
        value = n! / (a1)!...(ak)!
         */
        assertEquals(IntMath.factorial(str.length()) / (IntMath.factorial(2) * IntMath.factorial(2)), 
                permutations.size());
        assertTrue(permutations.stream().allMatch(x -> x.length() == str.length()));
    }
}