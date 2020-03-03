package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class ChangePi {

    public static String changePi(String s) {
        if (s.length() <= 1) return s;
        if (s.charAt(0) != 'p') return s.charAt(0) + changePi(s.substring(1));
        if (s.substring(0, 2).equals("pi")) return "3.14" + changePi(s.substring(2));
        return s.substring(0, 2) + changePi(s.substring(2));
    }
}
