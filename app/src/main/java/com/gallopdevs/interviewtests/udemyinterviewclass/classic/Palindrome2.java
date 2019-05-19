package com.gallopdevs.interviewtests.udemyinterviewclass.classic;

public class Palindrome2 {

    public boolean isPalindrome(String text) {
        char[] characters = text.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            if (characters[i] != characters[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
