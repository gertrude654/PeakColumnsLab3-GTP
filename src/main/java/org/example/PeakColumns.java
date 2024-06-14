package org.example;

public class PeakColumns {
    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 5 ,6 ,7, 7},
                {4, 2, 2, 8, 9},
                {6, 3, 2, 9, 7}
        };

        findPeakColumns(matrix);
    }

    public static void findPeakColumns(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int element = matrix[i][j];

                // Check if element is the maximum in its row
                if (element == getMaxInRow(matrix[i])) {
                    // Check if element is the minimum in its column
                    if (element == getMinInColumn(matrix, j)) {
                        System.out.printf("(%d,%d) = %d\n", i + 1, j + 1, element);
                    }
                }
            }
        }
    }

    private static int getMaxInRow(int[] row) {
        int max = row[0];
        for (int value : row) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int getMinInColumn(int[][] matrix, int colIndex) {
        int min = matrix[0][colIndex];
        for (int[] row : matrix) {
            if (row[colIndex] < min) {
                min = row[colIndex];
            }
        }
        return min;
    }
}

