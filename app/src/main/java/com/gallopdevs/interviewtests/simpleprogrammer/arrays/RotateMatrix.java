package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

public class RotateMatrix {
    // Rotate a square matrix by 90 degrees clockwise
    public static void rotateMatrixClockwise(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
        print(matrix);
    }

    public static void rotateMatrixCounterClockwise(int matrix[][]) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1 - i];                    // move values from right to top
                matrix[j][n - 1 - i] = matrix[n - 1 - i][n - 1 - j];    // move values from bottom to right
                matrix[n - 1 - i][n - 1 - j] = matrix[n - 1 - j][i];    // move values from left to bottom
                matrix[n - 1 - j][i] = temp;                            // assign temp to left
            }
        }
        print(matrix);
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
