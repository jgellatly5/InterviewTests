package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    // How are duplicates removed from a given array in Java?
    // How do you remove duplicates from an array in place?
    // How are duplicates removed from an array without using any library?
    public static int[] removeDuplicates(int[] numbers) {
        Arrays.sort(numbers);
        int[] result = new int[numbers.length];
        int previous =  numbers[0];
        result[0] = previous;
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            if (previous != current) {
                result[i] = current;
            }
            previous = current;
        }
        return result;
    }
}
