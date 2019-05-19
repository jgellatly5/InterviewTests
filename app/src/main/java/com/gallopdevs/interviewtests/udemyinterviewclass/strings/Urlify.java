package com.gallopdevs.interviewtests.udemyinterviewclass.strings;

public class Urlify {

    public static void urlify(String url, int length) {
        char[] result = new char[length];
        url = url.trim();
        int pointer = 0;
        char[] urlChars = url.toCharArray();
        for (int i = 0; i < urlChars.length; i++) {
            if (urlChars[i] != ' ') {
                result[pointer] = urlChars[i];
                pointer++;
            } else {
                result[pointer] = '%';
                result[pointer + 1] = '2';
                result[pointer + 2] = '0';
                pointer = pointer + 3;
            }
        }
        System.out.println(String.valueOf(result));
    }
}
