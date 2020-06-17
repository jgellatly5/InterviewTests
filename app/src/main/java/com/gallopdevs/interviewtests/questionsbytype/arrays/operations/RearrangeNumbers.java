package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class RearrangeNumbers {
    public static int[] rearrangeNumbers(int[] numbers) {
        int[] result = new int[numbers.length];
        int k = 0;
        for (int num : numbers) {
            if (num < 0) result[k++] = num;
        }
        for (int num : numbers) {
            if (num > 0) result[k++] = num;
        }
        return result;
    }
}
