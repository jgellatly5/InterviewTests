package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class MatchUp {
    public static int matchUp(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int diff = Math.abs(a[i] - b[i]);
            if (diff > 0 && diff <= 2) count++;
        }
        return count;
    }
}
