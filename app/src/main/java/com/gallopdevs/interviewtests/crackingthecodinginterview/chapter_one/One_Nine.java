package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

public class One_Nine {

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }
        return false;
    }
}
