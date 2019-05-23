package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindMultipleDuplicates2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.MinMaxArray2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.MissingNumber2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RemoveDuplicates2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ReverseArray2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RotateMatrix2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.TwoNumArraySum2;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ZeroMatrix2;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void MissingNumber() {
//        // one missing number
//        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
//        // two missing number
//        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 10}, 10);
//        // three missing number
//        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
//        // four missing number
//        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
//
        // Only one missing number in array
        int[] numbers = new int[]{1, 2, 3, 5};
        int missing = MissingNumber2.getMissingNumber(numbers, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(numbers), missing);

        MissingNumber2.printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 10}, 10);
    }

    @Test
    public void MultipleDuplicates() {
//        FindMultipleDuplicates.findMultipleDuplicate(new int[]{1, 2, 4, 1, 5, 6, 4});
//        FindMultipleDuplicates.findMultipleDuplicateSet(new int[]{1, 2, 4, 1, 5, 6, 4});
//        FindMultipleDuplicates.findMultipleDuplicatesAndCount(new int[]{1, 2, 4, 1, 5, 6, 4});

        FindMultipleDuplicates2.findDuplicates(new int[]{1, 2, 4, 1, 5, 6, 4});
        FindMultipleDuplicates2.findDuplicatesSet(new int[]{1, 2, 4, 1, 5, 6, 4});
        FindMultipleDuplicates2.findDuplicatesAndCount(new int[]{1, 2, 4, 1, 5, 6, 4});
    }

    @Test
    public void RemoveDuplicates() {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates2.removeDuplicates(input)));
        }
    }

    @Test
    public void MinMaxArray() {
        int[] test = new int[]{4, 3, 5, 6, 7, 2};
//        MinMaxArray.minMaxArray(test);
        MinMaxArray2.findMinAndMax(test);
    }

    @Test
    public void SumPairs() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
//        TwoNumArraySum.prettyPrint(numbers, 7);
//        TwoNumArraySum.prettyPrint(numbersWithDuplicates, 7);
//
//        TwoNumArraySum.prettyPrintSet(TwoNumArraySum.getRandomArray(9), 11);
//        TwoNumArraySum.prettyPrintSet(TwoNumArraySum.getRandomArray(10), 12);

        TwoNumArraySum2.printPairs(numbers, 7);
        System.out.println();
        TwoNumArraySum2.printPairsUsingSet(numbers, 7);
    }

    @Test
    public void ReverseArray() {
//        ReverseArray.reverseArray(new int[]{4, 3, 5, 6, 7, 2});
        ReverseArray2.reverse(new int[]{4, 3, 5, 6, 7, 2});
    }

    @Test
    public void RotateMatrix() {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
//        RotateMatrix2.rotateMatrixClockwise(matrix);
        System.out.println();
        RotateMatrix2.rotateMatrixCounterClockwise(matrix);
    }

    @Test
    public void ZeroMatrix() {
        int matrix[][] = {
                {1, 0, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ZeroMatrix2.zeroMatrix(matrix);
    }
}
