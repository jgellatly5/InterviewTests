package com.gallopdevs.interviewtests.udemyinterviewclass.strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagramSimple(String wordOne, String wordTwo) {
        char[] charsOne = wordOne.toCharArray();
        char[] charsTwo = wordTwo.toCharArray();

        Arrays.sort(charsOne);
        Arrays.sort(charsTwo);

        return Arrays.equals(charsOne, charsTwo);
    }
}
