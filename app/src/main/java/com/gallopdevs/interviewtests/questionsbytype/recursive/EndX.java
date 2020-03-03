package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class EndX {
    public static String endX(String s) {
        if (s.length() == 0) return s;
        if (s.charAt(0) == 'x') return endX(s.substring(1)) + "x";
        return s.charAt(0) + endX(s.substring(1));
    }
}
