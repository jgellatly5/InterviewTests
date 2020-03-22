package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Pre4 {
    public static int[] pre4(int[] numbers) {
        int length = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                length = i;
                break;
            }
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = numbers[i];
        }
        return result;
    }
}
