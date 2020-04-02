package com.gallopdevs.interviewtests.questionsbytype.strings;

public class CountSingleChar {
    public static int countSingleChar(String text, char c) {
        char[] characters = text.toCharArray();
        int counter = 0;
        for (char character : characters) {
            if (character == c) counter++;
        }
        return counter;
    }
}
