package com.gallopdevs.interviewtests.leetcode;

public class PalindromicSubstring {
    public static String palindromicSubstring(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (isPalindrome(s) && answer.length() < s.length()) answer = s;
                s = s.substring(0, s.length() - 1);
            }
        }
        return answer;
    }

    private static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != chars[n - 1 - i]) return false;
        }
        return true;
    }
}
