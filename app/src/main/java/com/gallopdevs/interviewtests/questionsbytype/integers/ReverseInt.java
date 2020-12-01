package com.gallopdevs.interviewtests.questionsbytype.integers;

public class ReverseInt {
    public static int reverseInt(int x) {
        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10) return 0;
            if (reverse < Integer.MIN_VALUE / 10) return 0;
            reverse = reverse * 10 + pop;
        }
        return reverse;
    }
}
