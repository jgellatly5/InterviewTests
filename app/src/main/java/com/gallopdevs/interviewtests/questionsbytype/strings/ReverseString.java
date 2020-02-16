package com.gallopdevs.interviewtests.questionsbytype.strings;

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

    public static void reverseString(String text) {
        char[] chars = text.toCharArray();
        int left;
        int right = chars.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        System.out.println(String.valueOf(chars));
    }
}
