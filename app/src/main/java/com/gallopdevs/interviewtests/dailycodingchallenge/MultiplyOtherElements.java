package com.gallopdevs.interviewtests.dailycodingchallenge;

public class MultiplyOtherElements {
    public static int[] multiplyOtherElements(int[] numbers) {
        int[] result = new int[numbers.length];
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product = product * numbers[i];
        }
        for (int j = 0; j < numbers.length; j++) {
            result[j] = product / numbers[j];
        }
        return result;
    }

    // What if you cannot use division?
}
