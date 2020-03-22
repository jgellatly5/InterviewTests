package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Sum2 {
    public static int sum2(int[] numbers) {
        int sum = 0;
        if (numbers.length >= 2) sum += numbers[0] + numbers[1];
        else if (numbers.length == 1) sum = numbers[0];
        return sum;
    }
}
