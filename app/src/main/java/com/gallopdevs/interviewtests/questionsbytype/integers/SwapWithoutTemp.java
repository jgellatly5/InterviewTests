package com.gallopdevs.interviewtests.questionsbytype.integers;

public class SwapWithoutTemp {
    public static void swapDecimal(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void swapBinary(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("X: " + x + ", Y: " + y);
    }
}
