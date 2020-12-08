package com.gallopdevs.interviewtests.questionsbytype.arrays;

import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.ConcatenateTwoArrays;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FindDuplicatesCount;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FindDuplicatesLoop;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FindDuplicatesSet;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FindEvenAndOdd;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FindLowHighIndex;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FirstNonRepeating;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.FirstNonRepeatingLinkedHashMap;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.GetMissingNumber;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.MergeOverlaps;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.MinMaxArray;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.PrintMatrix;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.PrintMissingNumbers;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.PrintPairsSumLoop;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.PrintPairsSumSet;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.PushZerosToRight;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.RandomArray;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.RearrangeNumbers;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.RemoveDuplicates;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.ReverseArray;
import com.gallopdevs.interviewtests.questionsbytype.arrays.operations.RotateLeft;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {

    @Test
    public void SingleMissingNumber() {
        System.out.println("=========Test1 Single Number=========");
        // Only one missing number in array
        int[] numbers = new int[]{1, 2, 3, 5, 6};
        int missing = GetMissingNumber.getMissingNumber(numbers, numbers.length + 1);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers), missing);
    }

    @Test
    public void MultipleMissingNumbers() {
        System.out.println("=========Test1 Multiple Numbers=========");
        // one missing number
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 6}, 6);
        // two missing numbers
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 6, 7, 9, 10}, 10);
        // three missing numbers
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
        // four missing numbers
        PrintMissingNumbers.printMissingNumbers(new int[]{1, 2, 3, 4, 9, 8}, 10);
    }

    @Test
    public void FindDuplicatesLoop() {
        System.out.println("=========Test1 FindDuplicatesLoop=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesLoop.findDuplicatesLoop(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void FindDuplicatesSet() {
        System.out.println("=========Test1 FindDuplicatesSet=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesSet.findDuplicatesSet(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void FindDuplicatesCount() {
        System.out.println("=========Test1 FindDuplicatesCount=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesCount.findDuplicatesCount(numbers);
    }

    @Test
    public void RemoveDuplicates() {
        System.out.println("=========RemoveDuplicates=========");
        int[][] tests = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},
                {1, 1, 2, 2, 3, 3, 4}
        };
        for (int[] test : tests) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(test));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates.removeDuplicates(test)));
        }
    }

    @Test
    public void MinMaxArray() {
        int[] test = new int[]{10, 3, 5, 6, 7, 2};
        System.out.println("=========Test1=========");
        MinMaxArray.findMinAndMax(test);
    }

    @Test
    public void PrintPairsSumLoop() {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;
        System.out.println("=========Test1 PrintPairsSumLoop=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumLoop.printPairs(numbers, sum);
    }

    @Test
    public void PrintPairsSumSet() {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;
        System.out.println("=========Test1 PrintPairsSumSet=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumSet.printPairsSet(numbers, sum);
    }

    @Test
    public void ReverseArray() {
        System.out.println("=========Test1 ReverseArray=========");
        int[] reverseArray = new int[]{4, 3, 5, 6, 7, 2};
        int[] reverseArray2 = new int[]{4, 3, 5, 6, 7, 2, 10};
        System.out.println(Arrays.toString(reverseArray));
        ReverseArray.reverseArray(reverseArray);
        System.out.println(Arrays.toString(reverseArray2));
        ReverseArray.reverseArray(reverseArray2);
    }

    @Test
    public void RotateMatrixClockwise() {
        System.out.println("=========Test1=========");
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
        System.out.println("=========Test1=========");
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
    public void ZeroMatrix() {
        System.out.println("=========ZeroMatrix=========");
        int[][] matrix = {
                {0, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix.zeroMatrix(matrix);
        PrintMatrix.printMatrix(matrix);
    }

    @Test
    public void MedianTwoSortedArrays() {
        System.out.println("=========MedianTwoSortedArrays=========");
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Median: " + MedianTwoSortedArrays.medianTwoSortedArrays(a, b));
    }

    @Test
    public void MatrixProduct() {
        System.out.println("=========MatrixProduct=========");
        int[][] matrix = {
                {-1, 2, 3},
                {4, 5, -6},
                {7, 8, 9}
        };
        System.out.println(MatrixProduct.matrixProduct(matrix));
    }

    @Test
    public void RotateLeft() {
        System.out.println("=========RotateLeft=========");
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {5, 11, 9, 5};
        int[] test3 = {7, 0, 0, 5};
        System.out.println(Arrays.toString(RotateLeft.rotateLeft(test1)));
        System.out.println(Arrays.toString(RotateLeft.rotateLeft(test2)));
        System.out.println(Arrays.toString(RotateLeft.rotateLeft(test3)));
    }

    @Test
    public void CountPairsWithSum() {
        System.out.println("=========CountPairsWithSum=========");
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
    public void StockPrices() {
        System.out.println("=========StockPrices=========");
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
    public void FindLowHighIndex() {
        System.out.println("=========FindLowHighIndex=========");
        int[] test1 = {1, 2, 5, 5, 5, 5, 5, 7};
        int[] test2 = {1, 3, 4, 5, 5, 5, 5, 3};
        FindLowHighIndex.findLowHighIndex(test1, 5);
        FindLowHighIndex.findLowHighIndex(test2, 3);
    }

    @Test
    public void MergeOverlaps() {
        System.out.println("=========MergeOverlaps=========");
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
    public void MergeSortedArray() {
        int[] a = {1, 3, 5, 0, 0, 0};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        MergeSortedArray.mergeSortedArray(a, b, 3, 3);
        System.out.println(Arrays.toString(a));
    }

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
    public void ConcatenateTwoArrays() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ConcatenateTwoArrays.concatenateTwoArrays(a, b)));
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
    public void FindEvenAndOdd() {
        int[] problem24 = {1, 2, 3, 4, 5};
        FindEvenAndOdd.findEvenAndOdd(problem24);
    }

    @Test
    public void PushZerosToRight() {
        int[] test1 = {1, 0, 2, 0, 3, 0, 4, 5, 0};
        PushZerosToRight.pushZerosToEnd(test1);
    }

    @Test
    public void FirstNotRepeatingLinkedHashMap() {
        int[] test1 = {1, 1, 1, 4, 4, 5};
        int[] test2 = {1, 1, 7, 3, 4, 5};
        int[] test3 = {1, 1, 1, 1, 1, 1};
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test1);
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test2);
        FirstNonRepeatingLinkedHashMap.firstNonRepeat(test3);
    }

    @Test
    public void FirstNonRepeating() {
        int[] test1 = {1, 1, 1, 4, 4, 5};
        int[] test2 = {1, 1, 7, 3, 4, 5};
        int[] test3 = {1, 1, 1, 1, 1, 1};
        int[] test4 = {1, 4, 4};
        System.out.println(FirstNonRepeating.firstNonRepeating(test1));
        System.out.println(FirstNonRepeating.firstNonRepeating(test2));
        System.out.println(FirstNonRepeating.firstNonRepeating(test3));
        System.out.println(FirstNonRepeating.firstNonRepeating(test4));
    }

    @Test
    public void RearrangeNumbers() {
        int[] test1 = {-9, 5, 6, 7, -2, -3, -4, 10, 11, 12};
        int[] test2 = {5, 6, 7, -7, -9, -4, 12};
        System.out.println(Arrays.toString(RearrangeNumbers.rearrangeNumbers(test1)));
        System.out.println(Arrays.toString(RearrangeNumbers.rearrangeNumbers(test2)));
    }

    @Test
    public void Practice() {
        System.out.println(Arrays.toString(RandomArray.getRandomArray(5)));
    }
}
