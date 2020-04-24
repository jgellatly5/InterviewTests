package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class SelectionSort {
    // Time: O(n^2)
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
