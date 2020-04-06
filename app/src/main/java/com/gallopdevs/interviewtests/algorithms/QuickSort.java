package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class QuickSort {
    // Time: O(n^2)
    // Space: O(log(n))
    public static void quickSort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        int pivotValue = numbers[(lowIndex + highIndex) / 2];
        int partitionIndex = partition(numbers, lowIndex, highIndex, pivotValue);
        sort(numbers, lowIndex, partitionIndex - 1);
        sort(numbers, partitionIndex, highIndex);
    }

    private static int partition(int[] numbers, int lowIndex, int highIndex, int pivotValue) {
        while (lowIndex <= highIndex) {
            while (numbers[lowIndex] < pivotValue) {
                lowIndex++;
            }

            while (numbers[highIndex] > pivotValue) {
                highIndex--;
            }

            if (lowIndex <= highIndex) {
                swapValues(numbers, lowIndex, highIndex);
                lowIndex++;
                highIndex--;
            }
        }
        return lowIndex;
    }

    private static void swapValues(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
