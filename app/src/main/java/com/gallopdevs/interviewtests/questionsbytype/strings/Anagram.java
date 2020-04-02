package com.gallopdevs.interviewtests.questionsbytype.strings;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String wordOne, String wordTwo) {
        char[] charsOne = wordOne.toCharArray();
        char[] charsTwo = wordTwo.toCharArray();
        Arrays.sort(charsOne);
        Arrays.sort(charsTwo);
        return Arrays.equals(charsOne, charsTwo);
    }
}
