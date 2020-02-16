package com.gallopdevs.interviewtests.questionsbytype.strings;

public class IsUnique {
    public static boolean isUnique(String text) {
        if (text.length() > 128) return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < text.length(); i++) {
            if (charSet[text.charAt(i)]) return false;
            charSet[text.charAt(i)] = true;
        }
        return true;
    }
}
