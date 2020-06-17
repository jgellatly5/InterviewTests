package com.gallopdevs.interviewtests.leetcode;

public class PalindromicSubstring {
    public static String palindromicSubstring(String s) {
        String answer = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (isPalindrome(s) && answer.length() < s.length()) answer = s;
                s = s.substring(i, j);
                System.out.println("s: " + s);
                System.out.println("answer: " + answer);
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
