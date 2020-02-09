package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindDuplicatesCount;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindDuplicatesCount2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindDuplicatesLoop;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindDuplicatesLoop2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindDuplicatesSet;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindDuplicatesSet2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.MinMaxArray;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.MinMaxArray2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.GetMissingNumber;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.GetMissingNumber2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.PrintMissingNumbers;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.PrintMissingNumbers2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.PrintPairsSumSet;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.PrintPairsSumSet2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RemoveDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RemoveDuplicates2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ReverseArray;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ReverseArray2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrixClockwise;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrixClockwise2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.PrintPairsSumLoop;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.PrintPairsSumLoop2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrixCounterClockwise;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrixCounterClockwise2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ZeroMatrix;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ZeroMatrix2;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void SingleMissingNumber() {
        System.out.println("=========Test1 Single Number=========");
        // Only one missing number in array
        int[] numbers = new int[]{1, 2, 3, 5, 6};
        int missing = GetMissingNumber.getMissingNumber(numbers, numbers.length + 1);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers), missing);
        System.out.println("\n=========Test2 Single Number=========");
        // Only one missing number in array
        int[] numbers2 = new int[]{1, 2, 3, 5, 6};
        int missing2 = GetMissingNumber2.getMissingNumber(numbers2, numbers2.length + 1);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers2), missing2);
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
        System.out.println("\n=========Test2 Multiple Numbers=========");
        // one missing number
        PrintMissingNumbers2.printMissingNumbers(new int[]{1, 2, 3, 4, 6}, 6);
        // two missing numbers
        PrintMissingNumbers2.printMissingNumbers(new int[]{1, 2, 3, 4, 6, 7, 9, 10}, 10);
        // three missing numbers
        PrintMissingNumbers2.printMissingNumbers(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
        // four missing numbers
        PrintMissingNumbers2.printMissingNumbers(new int[]{1, 2, 3, 4, 9, 8}, 10);
    }

    @Test
    public void FindDuplicatesLoop() {
        System.out.println("=========Test1 FindDuplicatesLoop=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesLoop.findDuplicatesLoop(new int[]{1, 2, 4, 1, 5, 6, 4});
        System.out.println("\n=========Test2 FindDuplicatesLoop=========");
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesLoop2.findDuplicatesLoop(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void FindDuplicatesSet() {
        System.out.println("=========Test1 FindDuplicatesSet=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesSet.findDuplicatesSet(new int[]{1, 2, 4, 1, 5, 6, 4});
        System.out.println("\n=========Test2 FindDuplicatesSet=========");
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesSet2.findDuplicatesSet(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void FindDuplicatesCount() {
        System.out.println("=========Test1 FindDuplicatesCount=========");
        int[] numbers = new int[]{1, 2, 4, 1, 5, 6, 4};
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesCount.findDuplicatesCount(numbers);
        System.out.println("\n=========Test2 FindDuplicatesCount=========");
        System.out.println(Arrays.toString(numbers));
        FindDuplicatesCount2.findDuplicatesCount(numbers);
    }

    @Test
    public void RemoveDuplicates() {
        System.out.println("=========Test1=========");
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};
        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates.removeDuplicates(input)));
        }
        System.out.println("\n=========Test2=========");
        int[][] test2 = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};
        for (int[] input : test2) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates2.removeDuplicates(input)));
        }
    }

    @Test
    public void MinMaxArray() {
        int[] test = new int[]{10, 3, 5, 6, 7, 2};
        System.out.println("=========Test1=========");
        MinMaxArray.findMinAndMax(test);
        System.out.println("\n=========Test2=========");
        MinMaxArray2.findMinAndMax(test);
    }

    @Test
    public void PrintPairsSumLoop() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int sum = 7;
        System.out.println("=========Test1 PrintPairsSumLoop=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumLoop.printPairs(numbers, sum);
        System.out.println("\n=========Test2 PrintPairsSumLoop=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumLoop2.printPairs(numbers, sum);
    }

    @Test
    public void PrintPairsSumSet() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int sum = 7;
        System.out.println("=========Test1 PrintPairsSumSet=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumSet.printPairsSet(numbers, sum);
        System.out.println("\n=========Test2 PrintPairsSumSet=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        PrintPairsSumSet2.printPairsSet(numbers, sum);
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
        System.out.println("\n=========Test2 ReverseArray=========");
        System.out.println(Arrays.toString(reverseArray));
        ReverseArray2.reverseArray(reverseArray);
        System.out.println(Arrays.toString(reverseArray2));
        ReverseArray2.reverseArray(reverseArray2);
    }

    @Test
    public void RotateMatrixClockwise() {
        System.out.println("=========Test1=========");
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        RotateMatrixClockwise.rotateMatrixClockwise(matrix);
        printMatrix(matrix);
        System.out.println("\n=========Test2=========");
        RotateMatrixClockwise2.rotateMatrixClockwise(matrix);
        printMatrix(matrix);
    }

    @Test
    public void RotateMatrixCounterClockwise() {
        System.out.println("=========Test1=========");
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        RotateMatrixCounterClockwise.rotateMatrixCounterClockwise(matrix);
        printMatrix(matrix);
        System.out.println("\n=========Test2=========");
        RotateMatrixCounterClockwise2.rotateMatrixCounterClockwise(matrix);
        printMatrix(matrix);
    }

    @Test
    public void ZeroMatrix() {
        System.out.println("=========Test1=========");
        int matrix[][] = {
                {0, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix.zeroMatrix(matrix);
        printMatrix(matrix);
        System.out.println("\n=========Test2=========");
        int matrix2[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 0},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix2.zeroMatrix(matrix2);
        printMatrix(matrix2);
    }

    private static int[] getRandomArray(int length) {
        int[] randomNums = new int[length];
        for (int i = 0; i < length; i++) {
            randomNums[i] = (int) (Math.random() * 15);
        }
        return randomNums;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
