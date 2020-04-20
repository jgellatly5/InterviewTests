package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class RadixSort {
    // Time: O(nk)
    // Space: O(n + k)
    public static void radixSort(int[] numbers) {
        int key = numbers[0];
        int digit = 1;
        int[] sorted = new int[10];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > key) {
                key = numbers[i];
            }
        }
        while (key / digit > 0) {
            int[] bucket = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                bucket[(numbers[i] / digit) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = numbers.length - 1; i >= 0; i--) {
                sorted[--bucket[(numbers[i] / digit) % 10]] = numbers[i];
            }
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sorted[i];
            }
            digit *= 10;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
