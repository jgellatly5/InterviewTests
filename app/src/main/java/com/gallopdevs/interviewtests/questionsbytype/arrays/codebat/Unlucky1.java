package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Unlucky1 {
    public static boolean unlucky1(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (i > 1 && i < numbers.length - 2) continue;
            if (numbers[i] == 1 && numbers[i + 1] == 3) return true;
        }
        return false;
    }
}
