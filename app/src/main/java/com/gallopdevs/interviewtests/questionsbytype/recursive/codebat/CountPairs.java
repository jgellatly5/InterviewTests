package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class CountPairs {
    public static int countPairs(String s) {
        if (s.length() <= 2) return 0;
        if (s.charAt(0) == s.charAt(2)) {
            return 1 + countPairs(s.substring(1));
        }
        return countPairs(s.substring(1));
    }
}
