package com.gallopdevs.interviewtests.questionsbytype.strings;

public class ReverseInt {
    public int reverseInt(int num) {
        String numText = String.valueOf(num);
        StringBuilder text = new StringBuilder(numText);
        String newText = text.reverse().toString();
        int newInt = Integer.parseInt(newText);
        System.out.println(newInt);
        return newInt;
    }
}
