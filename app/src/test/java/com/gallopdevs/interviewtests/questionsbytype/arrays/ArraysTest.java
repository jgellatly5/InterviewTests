package com.gallopdevs.interviewtests.questionsbytype.arrays;

import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.PrintMatrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    @Test
    public void ConsecutiveArray() {
        int[] test1 = {4, 2, 1, 6, 5};
        int[] test2 = {5, 5, 3, 1};
        System.out.println(ConsecutiveArray.consecutiveArraySet(test1));
        System.out.println(ConsecutiveArray.consecutiveArraySort(test1));
        System.out.println(ConsecutiveArray.consecutiveArraySet(test2));
        System.out.println(ConsecutiveArray.consecutiveArraySort(test2));
    }

    @Test
    public void CountPairsWithSum() {
        int[] numbers = {2, 3, 6, 2, 8};
        System.out.println(CountPairsWithSum.countPairsWithSum(numbers, 8));
        System.out.println(CountPairsWithSum.countPairsWithSumSet(numbers, 8));
        int[] numbers2 = {7, 15, 9, 10, 2, 1, 5, 2, 6, 11, 6};
        System.out.println(CountPairsWithSum.countPairsWithSum(numbers2, 12));
        System.out.println(CountPairsWithSum.countPairsWithSumSet(numbers2, 12));
        int[] numbers3 = {2, 2, 2, 2, 2, 2};
        System.out.println(CountPairsWithSum.countPairsWithSum(numbers3, 4));
        System.out.println(CountPairsWithSum.countPairsWithSumSet(numbers3, 4));
    }

    @Test
    public void FindPermutations() {
        int[] test1 = {1, 2, 3};
        ArrayList<int[]> results = FindPermutations.findPermutations(test1);
        for (int[] element : results) {
            System.out.println(Arrays.toString(element));
        }
    }

    @Test
    public void MatrixProduct() {
        int[][] matrix = {
                {-1, 2, 3},
                {4, 5, -6},
                {7, 8, 9}
        };
        System.out.println(MatrixProduct.matrixProduct(matrix));
    }

    @Test
    public void MedianTwoSortedArrays() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Median: " + MedianTwoSortedArrays.medianTwoSortedArrays(a, b));
    }

    @Test
    public void MergeOverlaps() {
        List<List<Integer>> test1 = new ArrayList<>();
        List<Integer> pair1 = new ArrayList<>();
        pair1.add(1);
        pair1.add(5);
        List<Integer> pair2 = new ArrayList<>();
        pair1.add(3);
        pair1.add(7);
        List<Integer> pair3 = new ArrayList<>();
        pair1.add(4);
        pair1.add(6);
        List<Integer> pair4 = new ArrayList<>();
        pair1.add(6);
        pair1.add(8);
        test1.add(pair1);
        test1.add(pair2);
        test1.add(pair3);
        test1.add(pair4);
        List<Integer> result = MergeOverlaps.mergeOverlaps(test1);
        for (Integer num : result) {
            System.out.print(num + ", ");
        }
    }

    @Test
    public void RotateMatrixClockwise() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        RotateMatrixClockwise.rotateMatrixClockwise(matrix);
        PrintMatrix.printMatrix(matrix);
    }

    @Test
    public void RotateMatrixCounterClockwise() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        RotateMatrixCounterClockwise.rotateMatrixCounterClockwise(matrix);
        PrintMatrix.printMatrix(matrix);
    }

    @Test
    public void StockPrices() {
        int[] test1 = {100, 80, 120, 130, 70, 60, 100, 125};
        int[] test2 = {100, 80, 70, 65, 60, 55, 50};
        int[] test3 = {5, 7, 8, 4, 12, 1};
        int[] test4 = {1, 0};
        int[] test5 = {1};
        System.out.println(StockPrices.maxProfit(test1));
        System.out.println(StockPrices.findMaxProfit(test1));
        System.out.println(StockPrices.maxProfit(test2));
        System.out.println(StockPrices.findMaxProfit(test2));
        System.out.println(StockPrices.maxProfit(test3));
        System.out.println(StockPrices.findMaxProfit(test3));
        System.out.println(StockPrices.maxProfit(test4));
        System.out.println(StockPrices.findMaxProfit(test4));
        System.out.println(StockPrices.maxProfit(test5));
        System.out.println(StockPrices.findMaxProfit(test5));
    }

    @Test
    public void ZeroMatrix() {
        int[][] matrix = {
                {0, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix.zeroMatrix(matrix);
        PrintMatrix.printMatrix(matrix);
    }
}
