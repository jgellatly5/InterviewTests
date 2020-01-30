package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class InsertionSort2 {
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j;
            for (j = i - 1; (j >= 0 && numbers[j] > key); j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = key;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
