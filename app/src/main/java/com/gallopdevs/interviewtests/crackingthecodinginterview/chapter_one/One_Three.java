package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

public class One_Three {

    public static void urlify(String url, int length) {
        url = url.trim();
        char[] result = new char[length];
        int pointer = 0;
        char[] characters = url.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char letter = characters[i];
            if (letter != ' ') {
                result[pointer] = letter;
                pointer++;
            } else {
                result[pointer] = '%';
                result[pointer + 1] = '2';
                result[pointer + 2] = '0';
                pointer += 3;
            }
        }
        System.out.println(result);
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        int index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0';
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
