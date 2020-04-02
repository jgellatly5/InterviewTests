package com.gallopdevs.interviewtests.questionsbytype.strings;

public class RemoveDuplicates {
    public static void removeDuplicates(String text) {
        char[] characters = text.toCharArray();
        String targetString = "";
        for (char value : characters) {
            if (targetString.indexOf(value) == -1) {
                targetString += value;
            }
        }
        System.out.println(targetString);
    }
}
