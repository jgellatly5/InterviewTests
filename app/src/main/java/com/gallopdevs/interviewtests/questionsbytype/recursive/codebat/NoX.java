package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class NoX {
    public static String noX(String s) {
        if (s.length() == 0) return s;
        if (s.charAt(0) == 'x') return "" + noX(s.substring(1));
        return s.charAt(0) + noX(s.substring(1));
    }
}
