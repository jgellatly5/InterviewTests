package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class SelectionSort2 {
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            swap(numbers, index, i);
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void swap(int[] numbers, int indexOne, int indexTwo) {
        int temp = numbers[indexOne];
        numbers[indexOne] = numbers[indexTwo];
        numbers[indexTwo] = temp;
    }
}
