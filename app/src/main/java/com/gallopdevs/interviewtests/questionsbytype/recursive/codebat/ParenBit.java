package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class ParenBit {
    public static String parenBit(String s) {
        if (s.length() == 0) return s;
        if (s.charAt(0) == '(') return '(' + s.substring(1, s.indexOf(')')) + ')';
        return parenBit(s.substring(1));
    }
}
