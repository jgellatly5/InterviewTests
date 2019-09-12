package com.gallopdevs.interviewtests.simpleprogrammer.strings;

public class Rotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }
        return false;
    }
}
