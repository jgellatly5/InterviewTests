package com.gallopdevs.interviewtests.questionsbytype.strings.operations;

public class IsPalindrome {
    // Time: O(n)
    public static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) return false;
        }
        return true;
    }
}
