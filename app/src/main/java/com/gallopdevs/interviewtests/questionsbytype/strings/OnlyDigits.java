package com.gallopdevs.interviewtests.questionsbytype.strings;

import java.util.regex.Pattern;

public class OnlyDigits {

    public static void checkOnlyDigits(String text) {
        Pattern pattern = Pattern.compile(".*\\D.*"); // checks for non digit
        System.out.println(text + " is a number: " + !pattern.matcher(text).matches());
    }
}
