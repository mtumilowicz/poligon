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

        return SubSetSum.isAnySubset_recursive_repetitions(set, set.length, sum);
    }

    static boolean isAnySubset_dynamically(int set[], int sum) {
        return isAnySubset_dynamically(set, set.length, sum);
    }

    private static boolean isAnySubset_dynamically(int set[], int n, int sum) {

        boolean subset[][] = new boolean[sum + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            subset[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {

                subset[i][j] = subset[i][j - 1];

                if (i >= set[j - 1]) {
                    subset[i][j] = subset[i][j - 1] ||
                            subset[i - set[j - 1]][j - 1];
                }
            }
        }
        return subset[sum][n];
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
