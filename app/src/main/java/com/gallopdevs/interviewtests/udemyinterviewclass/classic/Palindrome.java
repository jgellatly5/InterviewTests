package com.gallopdevs.interviewtests.udemyinterviewclass.classic;

public class Palindrome {

    public boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
