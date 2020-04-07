package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class CountHi {
    public static int countHi(String s) {
        if (s.length() == 0 || s.length() == 1) return 0;
        if (s.charAt(0) == 'h' && s.charAt(1) == 'i') {
            return 1 + countHi(s.substring(2));
        }
        return countHi(s.substring(1));
    }
}
