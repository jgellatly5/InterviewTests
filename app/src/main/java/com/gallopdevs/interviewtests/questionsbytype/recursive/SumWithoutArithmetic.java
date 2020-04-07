package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class SumWithoutArithmetic {
    public static int sumWithoutArithmetic(int a, int b) {
        if (b == 0) return a;
        int partialSum = a ^ b;
        int carry = (a & b) << 1;
        return sumWithoutArithmetic(partialSum, carry);
    }
}
