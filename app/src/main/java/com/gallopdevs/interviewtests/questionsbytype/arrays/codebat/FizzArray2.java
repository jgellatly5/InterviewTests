package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class FizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }
}
