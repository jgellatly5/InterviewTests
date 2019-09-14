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
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RemoveDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RemoveDuplicates2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ReverseArray;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ReverseArray2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrix;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrix2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.TwoNumArraySum;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.TwoNumArraySum2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ZeroMatrix;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ZeroMatrix2;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void SingleMissingNumber() {
        System.out.println("=========Test1 Single Number=========");
        // Only one missing number in array
        int[] numbers = new int[]{1, 2, 3, 5};
        int missing = GetMissingNumber.getMissingNumber(numbers, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers), missing);
        System.out.println("\n=========Test2 Single Number=========");
        // Only one missing number in array
        int[] numbers2 = new int[]{1, 2, 3, 5};
        int missing2 = GetMissingNumber2.getMissingNumber(numbers, 5);
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
        System.out.println();
        System.out.println("=========Test2=========");
        MinMaxArray2.findMinAndMax(test);
    }

    @Test
    public void SumPairs() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        int sum = 7;
        System.out.println("=========Test1=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        TwoNumArraySum.printPairs(numbers, sum);
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        TwoNumArraySum.printPairsSet(numbers, sum);
        System.out.println("\n=========Test2=========");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        TwoNumArraySum2.printPairs(numbers, sum);
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        TwoNumArraySum2.printPairsSet(numbers, sum);
    }

    @Test
    public void ReverseArray() {
        System.out.println("=========Test1 ReverseArray=========");
        int[] reverseArray = new int[]{4, 3, 5, 6, 7, 2};
        System.out.println(Arrays.toString(reverseArray));
        ReverseArray.reverseArray(reverseArray);
        System.out.println("\n=========Test2 ReverseArray=========");
        int[] reverseArray2 = new int[]{4, 3, 5, 6, 7, 2};
        System.out.println(Arrays.toString(reverseArray2));
        ReverseArray2.reverseArray(reverseArray2);
    }

    @Test
    public void RotateMatrix() {
        System.out.println("=========Test1=========");
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        RotateMatrix.rotateMatrixClockwise(matrix);
        System.out.println();
        RotateMatrix.rotateMatrixCounterClockwise(matrix);
        System.out.println();
        System.out.println("=========Test2=========");
        int matrix2[][] = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120},
                {130, 140, 150, 160}
        };
        RotateMatrix2.rotateMatrixClockwise(matrix2);
        System.out.println();
//        RotateMatrix2.rotateMatrixCounterClockwise(matrix2);
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
        System.out.println();
        System.out.println("=========Test2=========");
        int matrix2[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 0},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix2.zeroMatrix(matrix2);
    }

    public static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for(int i=0; i<length; i++) {
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }
}
