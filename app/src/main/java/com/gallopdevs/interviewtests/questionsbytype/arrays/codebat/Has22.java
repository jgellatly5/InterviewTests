package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Has22 {
    public static boolean has22(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 2) {
                if (numbers[i + 1] == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
