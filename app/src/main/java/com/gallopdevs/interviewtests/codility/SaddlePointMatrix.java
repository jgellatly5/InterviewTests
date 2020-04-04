package com.gallopdevs.interviewtests.codility;

public class SaddlePointMatrix {
    public static int findSaddlePoints(int[][] matrix) {
        int saddlePoints = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[0].length - 1; j++) {
                int current = matrix[i][j];
                if (current > matrix[i - 1][j] && current > matrix[i + 1][j]) {
                    if (current < matrix[i][j - 1] && current < matrix[i][j + 1]) {
                        System.out.println("local max row + local min column: " + current);
                        saddlePoints++;
                    }
                } else if (current < matrix[i - 1][j] && current < matrix[i + 1][j]) {
                    if (current > matrix[i][j - 1] && current > matrix[i][j + 1]) {
                        System.out.println("local min row + local max column: " + current);
                        saddlePoints++;
                    }
                }
            }
            System.out.println();
        }
        return saddlePoints;
    }
}
