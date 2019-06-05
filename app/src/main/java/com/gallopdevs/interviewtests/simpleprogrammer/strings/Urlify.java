package com.gallopdevs.interviewtests.simpleprogrammer.strings;

public class Urlify {

    public static String urlify(char[] url, int trueLength) {
        if (url == null) return "";
        int spaceCount = 0;
        // first loop, locate last position
        for (int i = 0; i < trueLength; i++) {
            if (url[i] == ' ') {
                spaceCount++;
            }
        }
        int index = trueLength + (spaceCount * 2) - 1;
        // second loop, replace spaces from the end
        for (int i = trueLength - 1; i >= 0; i--) {
            if (url[i] == ' ') {
                url[index] = '0';
                url[index - 1] = '2';
                url[index - 2] = '%';
                index -= 3;
            } else {
                url[index] = url[i];
                index--;
            }
        }
        return new String(url).trim();
    }
}
