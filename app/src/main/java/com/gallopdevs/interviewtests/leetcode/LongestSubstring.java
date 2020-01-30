package com.gallopdevs.interviewtests.leetcode;

import java.util.HashSet;

public class LongestSubstring {
    // 1. Brute Force
    public static int lengthOfLongestSubstringSlow(String s) {
        int n = s.length();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) answer = Math.max(answer, j - i);
            }
        }
        return answer;
    }

    private static boolean allUnique(String s, int start, int end) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character c = s.charAt(i);
            if (hashSet.contains(c)) return false;
            hashSet.add(c);
        }
        return true;
    }

    // 2. Sliding Window
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> hashSet = new HashSet<>();
        int answer = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j++));
                answer = Math.max(answer, j - i);
            } else {
                hashSet.remove(s.charAt(i++));
            }
        }
        return answer;
    }
}
