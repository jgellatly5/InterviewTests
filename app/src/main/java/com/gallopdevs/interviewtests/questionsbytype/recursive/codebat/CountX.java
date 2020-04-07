package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class CountX {
    public static int countX(String s) {
        if (s.length() == 0) return 0;
        if (s.charAt(0) == 'x') return 1 + countX(s.substring(1));
        return countX(s.substring(1));
    }
}
