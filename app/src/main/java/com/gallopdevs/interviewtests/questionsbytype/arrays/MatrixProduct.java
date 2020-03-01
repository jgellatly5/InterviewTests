package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class MatrixProduct {

    public static int matrixProduct(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[][] minCache = new int[matrix.length][matrix[0].length];
        int[][] maxCache = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    minCache[i][j] = matrix[i][j];
                    maxCache[i][j] = matrix[i][j];
                    continue;
                }
                int maxVal = Integer.MIN_VALUE;
                int minVal = Integer.MAX_VALUE;
                if (i > 0) {
                    int tempMax = Math.max(
                            matrix[i][j] * maxCache[i - 1][j],
                            matrix[i][j] * minCache[i - 1][j]
                    );
                    maxVal = Math.max(maxVal, tempMax);
                    int tempMin = Math.min(
                            matrix[i][j] * maxCache[i - 1][j],
                            matrix[i][j] * minCache[i - 1][j]
                    );
                    minVal = Math.min(minVal, tempMin);
                }
                if (j > 0) {
                    int tempMax = Math.max(
                            matrix[i][j] * maxCache[i][j - 1],
                            matrix[i][j] * minCache[i][j - 1]
                    );
                    maxVal = Math.max(maxVal, tempMax);
                    int tempMin = Math.min(
                            matrix[i][j] * maxCache[i][j - 1],
                            matrix[i][j] * minCache[i][j - 1]
                    );
                    minVal = Math.min(minVal, tempMin);
                }
                minCache[i][j] = minVal;
                maxCache[i][j] = maxVal;
            }
        }
        return maxCache[matrix.length - 1][matrix[0].length - 1];
    }
}
