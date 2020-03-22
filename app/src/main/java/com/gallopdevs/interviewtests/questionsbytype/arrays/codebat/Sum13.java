package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Sum13 {
    public static int sum13(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) i++;
            else sum += numbers[i];
        }
        return sum;
    }
}
