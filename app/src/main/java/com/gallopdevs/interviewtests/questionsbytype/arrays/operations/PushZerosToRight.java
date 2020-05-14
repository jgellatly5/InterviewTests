package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.Arrays;

public class PushZerosToRight {
    public static void pushZerosToEnd(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[count++] = numbers[i];
            }
        }
        while (count < numbers.length) {
            numbers[count++] = 0;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
