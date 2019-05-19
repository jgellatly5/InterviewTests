package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

public class One_Three_A {

    public static void urlify(char[] url, int trueLength) {
        int countSpaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (url[i] == ' ') {
                countSpaces++;
            }
        }

        int index = trueLength + countSpaces * 2;
        if (trueLength < url.length) url[trueLength] = '\0';
        for (int i = trueLength - 1; i >= 0; i--) {
            if (url[i] == ' ') {
                url[index - 1] = '0';
                url[index - 2] = '2';
                url[index - 3] = '%';
                index -= 3;
            } else {
                url[index - 1] = url[i];
                index--;
            }
        }
    }
}
