package com.gallopdevs.interviewtests.questionsbytype.strings.codebat;

public class EndOther {
    public static boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }
}
