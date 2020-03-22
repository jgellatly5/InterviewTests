package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class TripleUp {
    public static boolean tripleUp(int[] numbers) {
        int count = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1] - 1) {
                ++count;
                if (count == 3) return true;
            } else {
                count = 1;
            }
        }
        return false;
    }
}
