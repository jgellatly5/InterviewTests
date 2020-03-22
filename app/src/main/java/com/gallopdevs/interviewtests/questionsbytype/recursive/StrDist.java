package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class StrDist {
    public static int strDist(String s, String sub) {
        if (s.length() < sub.length()) return 0;
        if (s.substring(0, sub.length()).equals(sub)) {
            if (s.substring(s.length() - sub.length()).equals(sub)) {
                return s.length();
            }
            return strDist(s.substring(0, s.length() - 1), sub);
        }
        return strDist(s.substring(1), sub);
    }
}
