package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class SameEnds {
    public static boolean sameEnds(int[] numbers, int k) {
        if (k == 0) return true;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - k]) return false;
            --k;
            if (k == 0) break;
        }
        return true;
    }
}
