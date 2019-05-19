package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

public class One_One_A {
    public static boolean isUnique(String text) {
        if (text.length() > 128) return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < text.length(); i++) {
            int value = text.charAt(i);
            if (charSet[value]) {
                return false;
            }
            charSet[value] = true;
        }
        return true;
    }
}
