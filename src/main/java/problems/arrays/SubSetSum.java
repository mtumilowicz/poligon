package problems.arrays;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2018-10-13.
 */
final class SubSetSum {
    
    static boolean isAnySubset_recursive_noRepetitions(int[] set, int sum) {
        return SubSetSum.isAnySubset_recursive_noRepetitions(set, set.length, sum);
    }

    static boolean isAnySubset_recursive_repetitions(int[] set, int sum) {
        if (Arrays.stream(set).filter(x -> x == 1).findAny().isPresent()) {
            return true;
        }
        
        return SubSetSum.isAnySubset_recursive_noRepetitions(set, set.length, sum);
    }

    private static boolean isAnySubset_recursive_noRepetitions(int[] set, int n, int sum) {
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (set[n - 1] > sum) {
            return isAnySubset_recursive_noRepetitions(set, n - 1, sum);
        }

        return isAnySubset_recursive_noRepetitions(set, n - 1, sum) 
                || isAnySubset_recursive_noRepetitions(set, n - 1, sum - set[n - 1]);
    }

    private static boolean isAnySubset_recursive_repetitions(int[] set, int n, int sum) {
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (set[n - 1] > sum) {
            return isAnySubset_recursive_repetitions(set, n - 1, sum);
        }

        return isAnySubset_recursive_repetitions(set, n - 1, sum)
                || isAnySubset_recursive_repetitions(set, n, sum - set[n - 1]);
    }
}
