package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class ChangeXY {

    public static String changeXY(String s) {
        if (s.length() == 0) return s;
        char character = s.charAt(0);
        if (character == 'x') return 'y' + changeXY(s.substring(1));
        return character + changeXY(s.substring(1));
    }
}
