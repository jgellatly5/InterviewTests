package com.gallopdevs.interviewtests.questionsbytype.strings.operations;

public class ReverseString {

    // Using StringBuilder
    public static String reverseStringSimple(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    // Using Characters
    public static String reverseStringAdvanced(String text) {
        char[] characters = text.toCharArray();
        char[] reverseChars = new char[text.length()];
        for (int i = 0; i < characters.length; i++) {
            reverseChars[i] = characters[characters.length - i - 1];
        }
        return new String(reverseChars);
    }
}
