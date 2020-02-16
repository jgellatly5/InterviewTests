package com.gallopdevs.interviewtests.questionsbytype.strings;

public class Urlify {
    public static String urlify(char[] url, int trueLength) {
        if (url == null) return "";
        int countSpaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (url[i] == ' ') countSpaces++;
        }
        int index = trueLength + (countSpaces * 2) - 1;
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
