public class MatrixDiagonalsSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of diagonal elements
        int diagonalSum = calculateDiagonalSum(matrix);

        // Print the result
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }

    public static int calculateDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal
            sum += matrix[i][n - 1 - i]; // Secondary diagonal
        }

        // For odd-sized matrices, the center element is counted twice
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }
}
