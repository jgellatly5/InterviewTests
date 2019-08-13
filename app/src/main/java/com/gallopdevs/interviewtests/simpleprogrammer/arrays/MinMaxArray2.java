package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.Arrays;

public class MinMaxArray2 {
    public static void findMinAndMax(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Max: " + max);
        System.out.println("Min " + min);
    }
}
