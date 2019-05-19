package com.gallopdevs.interviewtests.udemyinterviewclass.strings;

public class IsPalindrome {

    public static boolean isPalindrome(String text) {
        char[] characters = text.toCharArray();
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (characters[i] != characters[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
