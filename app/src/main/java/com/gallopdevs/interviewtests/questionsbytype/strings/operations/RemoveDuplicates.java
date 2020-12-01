package com.gallopdevs.interviewtests.questionsbytype.strings.operations;

public class RemoveDuplicates {
    public static void removeDuplicates(String text) {
        char[] characters = text.toCharArray();
        StringBuilder targetString = new StringBuilder();
        for (char value : characters) {
            if (targetString.toString().indexOf(value) == -1) {
                targetString.append(value);
            }
        }
        System.out.println(targetString);
    }
}
