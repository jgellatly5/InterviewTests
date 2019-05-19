package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

import java.util.Arrays;

public class One_Two_A {

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return sort(s1).equals(sort(s2));
    }

    private static String sort(String text) {
        char[] content = text.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutationCounting(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] letters = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i)]--;
            if (letters[s2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}
