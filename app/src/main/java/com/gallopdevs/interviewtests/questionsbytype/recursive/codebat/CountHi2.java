package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class CountHi2 {
    public static int countHi2(String s) {
        if (s.length() < 2) return 0;
        if (s.substring(0, 2).equals("xh")) return countHi2(s.substring(2));
        if (s.substring(0, 2).equals("hi")) return 1 + countHi2(s.substring(2));
        return countHi2(s.substring(1));
    }
}
