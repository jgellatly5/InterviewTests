package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

public class RotateMatrix {

    // Rotate a square matrix by 90 degrees clockwise
    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];                                 //top is stored as temp
                matrix[first][i] = matrix[last - offset][first];            //top is now left
                matrix[last - offset][first] = matrix[last][last - offset]; //left is now bottom
                matrix[last][last - offset] = matrix[i][last];              //bottom is now right
                matrix[i][last] = top;                                      //right is now top
            }
        }
        print(matrix);
        return true;
    }

    public static boolean rotateMatrixCounterClockwise(int matrix[][]) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1 - i];                    // move values from right to top
                matrix[j][n - 1 - i] = matrix[n - 1 - i][n - 1 - j];    // move values from bottom to right
                matrix[n - 1 - i][n - 1 - j] = matrix[n - 1 - j][i];    // move values from left to bottom
                matrix[n - 1 - j][i] = temp;                            // assign temp to left
            }
        }
        print(matrix);
        return true;
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
