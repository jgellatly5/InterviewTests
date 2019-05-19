package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

import java.util.Arrays;

public class One_Two {

    public static boolean isPermutation(String textOne, String textTwo) {
        if (textOne.length() != textTwo.length()) return false;
        return sort(textOne).equals(sort(textTwo));
    }

    private static String sort(String text) {
        char[] content = text.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutationCounting(String textOne, String textTwo) {
        if (textOne.length() != textTwo.length()) return false;

        int[] letters = new int[128];
        for (int i = 0; i < textOne.length(); i++) {
            letters[textOne.charAt(i)]++;
        }

        for (int j = 0; j < textTwo.length(); j++) {
            letters[textTwo.charAt(j)]--;
            if (letters[textTwo.charAt(j)] < 0) {
                return false;
            }
        }
        return true;
    }
}
