package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class CountSeven {
    public static int countSeven(int n) {
        if (n == 0) return 0;
        if (n % 10 == 7) return 1 + countSeven(n / 10);
        else return countSeven(n / 10);
    }
}
