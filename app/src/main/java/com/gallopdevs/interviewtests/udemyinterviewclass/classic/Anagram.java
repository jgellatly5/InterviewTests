package com.gallopdevs.interviewtests.udemyinterviewclass.classic;

import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String text1, String text2) {
        char[] text1Chars = text1.toCharArray();
        char[] text2Chars = text2.toCharArray();

        Arrays.sort(text1Chars);
        Arrays.sort(text2Chars);

        return Arrays.equals(text1Chars, text2Chars);
    }
}
