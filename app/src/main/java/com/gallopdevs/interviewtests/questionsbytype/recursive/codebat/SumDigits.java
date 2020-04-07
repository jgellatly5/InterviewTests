package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class SumDigits {

    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
}
