package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static int[] removeDuplicates(int[] numbers) {
        Arrays.sort(numbers);
        int[] result = new int[numbers.length];
        int previous = numbers[0];
        result[0] = previous;
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            if (previous != current) result[i] = current;
            previous = current;
        }
        return result;
    }
}
