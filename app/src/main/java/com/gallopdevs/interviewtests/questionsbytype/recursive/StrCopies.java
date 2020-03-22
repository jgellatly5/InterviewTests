package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class StrCopies {
    public static boolean strCopies(String s, String sub, int n) {
        if (n == 0) return true;
        if (s.length() < sub.length()) return false;
        if (s.substring(0, sub.length()).equals(sub)) {
            return strCopies(s.substring(1), sub, n - 1);
        }
        return strCopies(s.substring(1), sub, n);
    }
}
