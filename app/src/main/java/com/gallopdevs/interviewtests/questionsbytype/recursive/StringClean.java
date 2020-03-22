package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class StringClean {
    public static String stringClean(String s) {
        if (s.length() < 2) return s;
        if (s.charAt(0) == (s.charAt(1))) return stringClean(s.charAt(0) + s.substring(2));
        return s.charAt(0) + stringClean(s.substring(1));
    }
}
