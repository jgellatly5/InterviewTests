package com.gallopdevs.interviewtests.questionsbytype.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String current = s.substring(i, j + 1);
                if (isPalindrome(current)) {
                    map.put(current, current.length());
                }
            }
        }
        int maxLength = Collections.max(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxLength) {
                return entry.getKey();
            }
        }
        return "";
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
