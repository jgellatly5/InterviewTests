package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.simpleprogrammer.arrays.MinMaxArray;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.MissingNumber;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.FindMultipleDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.RemoveDuplicates;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.ReverseArray;
import com.gallopdevs.interviewtests.simpleprogrammer.arrays.TwoNumArraySum;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void MissingNumber() {
        // one missing number
        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);

        // two missing number
        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 10}, 10);

        // three missing number
        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);

        // four missing number
        MissingNumber.printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);

        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = MissingNumber.getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
    }

    @Test
    public void MultipleDuplicates() {
        FindMultipleDuplicates.findMultipleDuplicate(new int[]{1, 2, 4, 1, 5, 6, 4});
        FindMultipleDuplicates.findMultipleDuplicateSet(new int[]{1, 2, 4, 1, 5, 6, 4});
        FindMultipleDuplicates.findMultipleDuplicatesAndCount(new int[]{1, 2, 4, 1, 5, 6, 4});
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
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates.removeDuplicates(input)));
        }
    }

    @Test
    public void MinMaxArray() {
        int[] test = new int[]{4, 3, 5, 6, 7, 2};
        MinMaxArray.minMaxArray(test);
    }

    @Test
    public void SumPairs() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        TwoNumArraySum.prettyPrint(numbers, 7);
        TwoNumArraySum.prettyPrint(numbersWithDuplicates, 7);

        TwoNumArraySum.prettyPrintSet(TwoNumArraySum.getRandomArray(9), 11);
        TwoNumArraySum.prettyPrintSet(TwoNumArraySum.getRandomArray(10), 12);
    }

    @Test
    public void ReverseArray() {
        ReverseArray.reverseArray(new int[]{4, 3, 5, 6, 7, 2});
    }
}
