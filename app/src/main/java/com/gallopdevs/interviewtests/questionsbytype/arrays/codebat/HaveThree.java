package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class HaveThree {
    public static boolean hasThree(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                if (i + 1 < numbers.length) {
                    if (numbers[i + 1] == 3) return false;
                }
                ++count;
            }
        }
        return count == 3;
    }
}
