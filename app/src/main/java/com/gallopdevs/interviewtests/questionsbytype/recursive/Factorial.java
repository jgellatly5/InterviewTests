package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) return n;
        return n * factorial(n - 1);
    }
}
