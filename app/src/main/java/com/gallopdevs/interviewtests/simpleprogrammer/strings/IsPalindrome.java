package com.gallopdevs.interviewtests.simpleprogrammer.strings;

public class IsPalindrome {

    public static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
