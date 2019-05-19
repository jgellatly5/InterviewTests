package com.gallopdevs.interviewtests.udemyinterviewclass.strings;

public class StringReverse {

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
