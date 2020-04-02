package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

import java.util.Arrays;

public class MaxEnd3 {
    public static int[] maxEndThree(int[] numbers) {
        int max = Math.max(numbers[0], numbers[numbers.length - 1]);
        int[] result = new int[numbers.length];
        Arrays.fill(result, max);
        return result;
    }
}
