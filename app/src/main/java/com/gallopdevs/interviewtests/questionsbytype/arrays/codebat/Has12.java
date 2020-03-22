package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class Has12 {
    public static boolean has12(int[] numbers) {
        boolean foundOne = false;
        for (int num : numbers) {
            if (num == 1) foundOne = true;
            if (num == 2 && foundOne) return true;
        }
        return false;
    }
}
