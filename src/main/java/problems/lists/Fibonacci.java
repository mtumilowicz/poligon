package problems.lists;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mtumilowicz on 2018-10-12.
 */
final class Fibonacci {
    
    static int recursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    static int tail_recursion(int n) {
        return tail_recursion_inner(n, 1, 1);
    }
    
    private static int tail_recursion_inner(int n, int first, int second) {
        if (n == 0) {
            return first;
        }
        if (n == 1) {
            return second;
        }
        return tail_recursion_inner(n - 1, second, first + second);
    }

    static int iteratively(int n) {
        int first = 1;
        int second = 1;
        int accumulator;
        if (n == 0) {
            return first;
        }
        for (int i = 2; i <= n; i++) {
            accumulator = first + second;
            first = second;
            second = accumulator;
        }
        return second;
    }

    static IntStream stream() {
        return Stream.iterate(new Pair(1, 1), Pair::nextFibonacci)
                .mapToInt(Pair::getFirst);
    }
    
    static final class Pair {
        final int first;
        final int second;

        Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }

        public Integer getFirst() {
            return first;
        }

        public Integer getSecond() {
            return second;
        }
        
        Pair nextFibonacci() {
            return new Pair(second, first + second);
        }
    }
}
