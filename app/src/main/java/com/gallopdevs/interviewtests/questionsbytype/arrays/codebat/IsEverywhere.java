package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class IsEverywhere {
    public static boolean isEverywhere(int[] numbers, int value) {
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != value) {
                if (!flag) {
                    flag = true;
                } else {
                    return false;
                }
            } else {
                flag = false;
            }
        }
        return true;
    }
}
