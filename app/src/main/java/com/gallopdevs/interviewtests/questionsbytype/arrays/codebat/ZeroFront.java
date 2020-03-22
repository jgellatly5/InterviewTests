package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class ZeroFront {
    public static int[] zeroFront(int[] numbers) {
        int[] result = new int[numbers.length];
        int count = 0;
        for (int num : numbers) {
            if (num == 0) count++;
        }
        for (int num : numbers) {
            if (num != 0) {
                result[count++] = num;
            }
        }
        return result;
    }
}
