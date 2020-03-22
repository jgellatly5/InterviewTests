package com.gallopdevs.interviewtests.questionsbytype.strings.codebat;

public class CatDog {
    public static boolean catDog(String s) {
        return finalCount(s) == 0;
    }

    private static int finalCount(String s) {
        if (s.length() < 3) return 0;
        if (s.substring(0, 3).equals("cat")) return finalCount(s.substring(3)) + 1;
        if (s.substring(0, 3).equals("dog")) return finalCount(s.substring(3)) - 1;
        return finalCount(s.substring(1));
    }
}
