package com.gallopdevs.interviewtests.questionsbytype.strings.operations;

import java.util.Arrays;

public class Anagram {
    // Time: O(n log(n))
    public static boolean isAnagram(String wordOne, String wordTwo) {
        char[] charsOne = wordOne.toCharArray();
        char[] charsTwo = wordTwo.toCharArray();
        Arrays.sort(charsOne);
        Arrays.sort(charsTwo);
        return Arrays.equals(charsOne, charsTwo);
    }
}
