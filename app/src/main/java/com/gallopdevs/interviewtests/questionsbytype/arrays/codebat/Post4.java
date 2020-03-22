package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Post4 {
    public static int[] post4(int[] numbers) {
        int length = 0;
        int start = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 4) {
                length = numbers.length - 1 - i;
                start = i + 1;
                break;
            }
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = numbers[start++];
        }
        return result;
    }
}
