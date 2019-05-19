package com.gallopdevs.interviewtests.udemyinterviewclass.classic;

public class ReverseString {

    public String reverse(String text) {
        char[] chars = text.toCharArray();
        char[] reverseChars = new char[text.length()];

        for (int i = 0; i < chars.length; i++) {
            reverseChars[i] = chars[chars.length - i - 1];
        }

        String result = new String(reverseChars);
        System.out.println(result);
        return result;
    }
}
