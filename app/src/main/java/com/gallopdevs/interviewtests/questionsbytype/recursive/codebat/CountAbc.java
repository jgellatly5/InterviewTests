package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class CountAbc {
    public static int countAbc(String s) {
        if (s.length() < 3) return 0;
        if (s.substring(0, 3).equals("abc") || s.substring(0, 3).equals("aba")) {
            return 1 + countAbc(s.substring(2));
        }
        return countAbc(s.substring(1));
    }
}
