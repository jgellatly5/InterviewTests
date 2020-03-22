package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Either24 {
    public static boolean either24(int[] numbers) {
        boolean found2 = false;
        boolean found4 = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 2 && numbers[i + 1] == 2) {
                found2 = true;
                break;
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 4 && numbers[i + 1] == 4) {
                found4 = true;
                break;
            }
        }
        if (found2) return !found4;
        return found4;
    }
}
