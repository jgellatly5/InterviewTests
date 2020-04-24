package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class ZeroMatrix {
    // Time: O(m * n), m = # of rows, n = # of columns
    // Space: O(m + n), m = # of rows, n = # of columns
    public static void zeroMatrix(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i]) nullifyRow(matrix, i);
        }
        for (int j = 0; j < column.length; j++) {
            if (column[j]) nullifyColumn(matrix, j);
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    // Time: O(n)
    public void zeroMatrix(boolean[][] matrix) {
        // Verify the input array is nonzero
        if (matrix.length == 0 || matrix[0].length == 0) return;

        // Determine whether the first row or first column is true
        boolean rowZero = false, colZero = false;
        for (boolean i : matrix[0]) {
            rowZero |= i;
        }
        for (boolean[] i : matrix) {
            colZero |= i[0];
        }

        // For each cell not in the first row/column, if it is true, set the
        // cell in the first row/same column and first column/same row to be
        // true
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j]) {
                    matrix[i][0] = true;
                    matrix[0][j] = true;
                }
            }
        }

        // Go through the first column and set each row to true where cell in
        // the first column is true
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0]) {
                for (int j = 1; j < matrix[i].length; j++) {
                    matrix[i][j] = true;
                }
            }
        }

        // Repeat for the rows
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j]) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = true;
                }
            }
        }

        // Set first row/column to true if necessary
        if (rowZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = true;
            }
        }

        if (colZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = true;
            }
        }
    }
}
