package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int startingIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[startingIndex]) {
                    startingIndex = j;
                }
            }
            int temp = numbers[startingIndex];
            numbers[startingIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
