package com.gallopdevs.interviewtests.questionsbytype.strings.codebat;

public class XyzThere {
    public static boolean xyzThere(String s) {
        if (s.length() < 3) return false;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("xyz")) {
                if (i == 0) return true;
                if (s.charAt(i - 1) != '.') return true;
            }
        }
        return false;
    }
}
