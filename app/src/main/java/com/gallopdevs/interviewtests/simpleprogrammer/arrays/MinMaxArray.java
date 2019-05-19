package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.Arrays;

public class MinMaxArray {

    // How do you find the largest and smallest number in an unsorted integer array?
    public static void minMaxArray(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + max);
        System.out.println("Smallest number in array is : " + min);
    }
}
