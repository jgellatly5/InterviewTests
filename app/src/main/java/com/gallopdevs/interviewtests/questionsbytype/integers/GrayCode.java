package com.gallopdevs.interviewtests.questionsbytype.integers;

public class GrayCode {
    //simple
    public static boolean isGraySimple(int a, int b) {
        int x = a ^ b;
        while (x > 0) {
            if (x % 2 == 1 && x >> 1 > 0) return false;
            x = x >> 1;
        }
        return true;
    }

    //advanced
    public static boolean isGrayAdvanced(int a, int b) {
        int x = a ^ b;
        return (x & (x - 1)) == 0;
    }
}
