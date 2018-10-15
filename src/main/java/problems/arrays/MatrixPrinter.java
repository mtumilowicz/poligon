package problems.arrays;

/**
 * Created by mtumilowicz on 2018-10-15.
 */
final class MatrixPrinter {
    static void print(boolean[][] matrix) {
        for (boolean []row : matrix) {
            for (boolean column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
