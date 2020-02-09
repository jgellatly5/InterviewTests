package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int startingElement = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[startingElement]) {
                    startingElement = j;
                }
            }
            swap(numbers, startingElement, i);
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
