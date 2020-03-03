package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class AllStar {
    public static String allStar(String s) {
        if (s.length() > 1) return s.charAt(0) + "*" + allStar(s.substring(1));
        return s;
    }
}
