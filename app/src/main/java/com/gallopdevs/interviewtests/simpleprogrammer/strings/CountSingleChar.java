package com.gallopdevs.interviewtests.simpleprogrammer.strings;

public class CountSingleChar {

    public static int countSingleChar(String text, char c) {
        char[] characters = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == c) {
                counter++;
            }
        }
        return counter;
    }
}
