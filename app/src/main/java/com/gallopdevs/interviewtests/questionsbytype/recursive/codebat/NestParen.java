package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class NestParen {
    public static boolean nestParen(String s) {
        int len = s.length();
        if (len == 0) return true;
        if (s.charAt(0) == '(' && s.charAt(len - 1) == ')') {
            return nestParen(s.substring(1, len - 1));
        }
        return false;
    }
}
