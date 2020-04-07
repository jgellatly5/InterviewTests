package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class Count11 {
    public static int count11(String s) {
        if (s.length() < 2) return 0;
        if (s.substring(0, 2).equals("11")) return 1 + count11(s.substring(2));
        return count11(s.substring(1));
    }
}
