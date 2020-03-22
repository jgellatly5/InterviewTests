package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Has77 {
    public static boolean has77(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 7) {
                if (numbers[i + 1] == 7) return true;
                else if (i + 2 < numbers.length) {
                    if (numbers[i + 2] == 7) return true;
                }
            }
        }
        return false;
    }
}
