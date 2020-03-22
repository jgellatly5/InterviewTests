package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class TwoTwo {
    public static boolean twoTwo(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 2) continue;
            if (i >= 1 && numbers[i - 1] == 2) continue;
            if (i < numbers.length - 1 && numbers[i + 1] == 2) continue;
            return false;
        }
        return true;
    }
}
