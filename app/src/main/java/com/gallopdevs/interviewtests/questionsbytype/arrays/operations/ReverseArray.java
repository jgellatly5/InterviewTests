package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.Arrays;

public class ReverseArray {
    // Time: O(n)
    public static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
