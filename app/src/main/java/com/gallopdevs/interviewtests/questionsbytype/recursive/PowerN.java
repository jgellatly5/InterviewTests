package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class PowerN {
    public static int powerN(int base, int n) {
        if (base == 0) return 0;
        if (base == 1 || n == 0) return 1;
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }
}
