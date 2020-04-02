package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Without10 {
    public static int[] without10(int[] numbers) {
        int[] result = new int[numbers.length];
        int i = 0;
        for (int num : numbers) {
            if (num != 10) result[i++] = num;
        }
        return result;
    }
}
