package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int startingElement = numbers[i];
            int j;
            for (j = i - 1; (j >= 0 && numbers[j] > startingElement); j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = startingElement;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
