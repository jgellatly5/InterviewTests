package com.gallopdevs.interviewtests.questionsbytype.strings;

public class CountVowels {

    public static void countVowels(String text) {
        char[] characters = text.toCharArray();
        int counter = 0;
        for (char singleChar : characters) {
            switch(singleChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
                default:
                    break;
            }
        }
        int consonants = characters.length - counter;
        System.out.println("Number of vowels: " + String.valueOf(counter));
        System.out.println("Number of consontants: " + String.valueOf(consonants));
    }
}
