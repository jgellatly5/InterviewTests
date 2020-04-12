package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class SquareSubmatrix {
    // F: First Solution
    //    public static int squareSubmatrix(boolean[][] matrix) {
    //        int max = 0;
    //        for (int i = 0; i < matrix.length; i++) {
    //            for (int j = 0; j < matrix[0].length; j++) {
    //                if (matrix[i][j]) {
    //                    max = Math.max(max, squareSubmatrix(matrix, i, j));
    //                }
    //            }
    //        }
    //        return max;
    //    }
    //
    //    private static int squareSubmatrix(boolean[][] matrix, int i, int j) {
    //        if (i == matrix.length || j == matrix[0].length) return 0;
    //        if (!matrix[i][j]) return 0;
    //        return 1 + Math.min(
    //                Math.min(
    //                        squareSubmatrix(matrix, i + 1, j),
    //                        squareSubmatrix(matrix, i, j + 1)
    //                ),
    //                squareSubmatrix(matrix, i + 1, j + 1)
    //        );
    //    }
    // A: Analyze the First Solution
    // Time: O(m * n * 3^n)
    // Space: O(m + n)
    // S: Find the Subproblems
    // Time: O(m * n)
    // Space: O(m * n)
    //    public static int squareSubmatrix(boolean[][] matrix) {
    //        int[][] cache = new int[matrix.length][matrix[0].length];
    //        int max = 0;
    //        for (int i = 0; i < matrix.length; i++) {
    //            for (int j = 0; j < matrix[0].length; j++) {
    //                if (matrix[i][j]) {
    //                    max = Math.max(max, squareSubmatrix(matrix, i, j, cache));
    //                }
    //            }
    //        }
    //        return max;
    //    }
    //
    //    private static int squareSubmatrix(boolean[][] matrix, int i, int j, int[][] cache) {
    //        if (i == matrix.length || j == matrix[0].length) return 0;
    //        if (!matrix[i][j]) return 0;
    //        if (cache[i][j] > 0) return cache[i][j];
    //        cache[i][j] = 1 + Math.min(
    //                Math.min(
    //                        squareSubmatrix(matrix, i + 1, j, cache),
    //                        squareSubmatrix(matrix, i, j + 1, cache)
    //                ),
    //                squareSubmatrix(matrix, i + 1, j + 1, cache)
    //        );
    //        return cache[i][j];
    //    }
    // T: Top-Down -> Bottom-Up Solution
    // Time: O(m * n)
    // Space: O(m * n)
    public static int squareSubmatrix(boolean[][] matrix) {
        int max = 0;
        int[][] cache = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                if (i == 0 || j == 0) {
                    cache[i][j] = matrix[i][j] ? 1 : 0;
                } else if (matrix[i][j]) {
                    cache[i][j] = 1 + Math.min(
                            Math.min(
                                    cache[i][j - 1],
                                    cache[i - 1][j]
                            ),
                            cache[i - 1][j - 1]
                    );
                }
                max = Math.max(max, cache[i][j]);
            }
        }
        return max;
    }
}
