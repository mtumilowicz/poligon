package problems.lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-10-12.
 */
public class FibonacciTest {

    @Test
    public void recursion_0() {
        assertThat(Fibonacci.recursion(0), is(1));
    }

    @Test
    public void recursion_1() {
        assertThat(Fibonacci.recursion(1), is(1));
    }

    @Test
    public void recursion_2() {
        assertThat(Fibonacci.recursion(2), is(2));
    }

    @Test
    public void recursion_3() {
        assertThat(Fibonacci.recursion(3), is(3));
    }

    @Test
    public void recursion_4() {
        assertThat(Fibonacci.recursion(4), is(5));
    }

    @Test
    public void recursion_5() {
        assertThat(Fibonacci.recursion(5), is(8));
    }

    @Test
    public void recursion_35() {
        assertThat(Fibonacci.recursion(35), is(14930352));
    }

    @Test
    public void tail_recursion_0() {
        assertThat(Fibonacci.tail_recursion(0), is(1));
    }

    @Test
    public void tail_recursion_1() {
        assertThat(Fibonacci.tail_recursion(1), is(1));
    }

    @Test
    public void tail_recursion_2() {
        assertThat(Fibonacci.tail_recursion(2), is(2));
    }

    @Test
    public void tail_recursion_3() {
        assertThat(Fibonacci.tail_recursion(3), is(3));
    }

    @Test
    public void tail_recursion_4() {
        assertThat(Fibonacci.tail_recursion(4), is(5));
    }

    @Test
    public void tail_recursion_5() {
        assertThat(Fibonacci.tail_recursion(5), is(8));
    }

    @Test
    public void tail_recursion_35() {
        assertThat(Fibonacci.tail_recursion(35), is(14930352));
    }
    
    @Test
    public void iteratively_0() {
        assertThat(Fibonacci.iteratively(0), is(1));
    }

    @Test
    public void iteratively_1() {
        assertThat(Fibonacci.iteratively(1), is(1));
    }

    @Test
    public void iteratively_2() {
        assertThat(Fibonacci.iteratively(2), is(2));
    }

    @Test
    public void iteratively_3() {
        assertThat(Fibonacci.iteratively(3), is(3));
    }

    @Test
    public void iteratively_4() {
        assertThat(Fibonacci.iteratively(4), is(5));
    }

    @Test
    public void iteratively_5() {
        assertThat(Fibonacci.iteratively(5), is(8));
    }

    @Test
    public void iteratively_35() {
        assertThat(Fibonacci.iteratively(35), is(14930352));
    }

    @Test
    public void stream() {
    }

    @Test
    public void stream_0() {
        List<Integer> fibonacci = Fibonacci.stream().limit(1).boxed().collect(Collectors.toList());
        List<Integer> expected = Collections.singletonList(1);
        
        assertThat(fibonacci, is(expected));
    }

    @Test
    public void stream_1() {
        List<Integer> fibonacci = Fibonacci.stream().limit(2).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 1);

        assertThat(fibonacci, is(expected));
    }

    @Test
    public void stream_2() {
        List<Integer> fibonacci = Fibonacci.stream().limit(3).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 1, 2);

        assertThat(fibonacci, is(expected));
    }

    @Test
    public void stream_3() {
        List<Integer> fibonacci = Fibonacci.stream().limit(4).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 1, 2, 3);

        assertThat(fibonacci, is(expected));
    }

    @Test
    public void stream_4() {
        List<Integer> fibonacci = Fibonacci.stream().limit(5).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);

        assertThat(fibonacci, is(expected));
    }

    @Test
    public void stream_5() {
        List<Integer> fibonacci = Fibonacci.stream().limit(6).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8);

        assertThat(fibonacci, is(expected));
    }

    @Test
    public void stream_35() {
        List<Integer> fibonacci = Fibonacci.stream().limit(28).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(
                1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811);

        assertThat(fibonacci, is(expected));
    }
}