package com.gallopdevs.interviewtests.udemyinterviewclass.strings;

public class ReverseString {

    public static void reverseStringSimple(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static void reverseStringAdvanced(String text) {
        char[] characters = text.toCharArray();
        char[] reverseChars = new char[text.length()];

        for (int i = 0; i < characters.length; i++) {
            reverseChars[i] = characters[characters.length - i - 1];
        }
        String finalString = new String(reverseChars);
        System.out.println(finalString);
    }
}
