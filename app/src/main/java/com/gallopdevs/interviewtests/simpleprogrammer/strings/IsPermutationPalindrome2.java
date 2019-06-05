package com.gallopdevs.interviewtests.simpleprogrammer.strings;

public class IsPermutationPalindrome2 {

    public static boolean isPermutationPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[
                Character.getNumericValue('z') - Character.getNumericValue('a') + 1
            ];
        for (char c : phrase.toCharArray()) {
            int index = getCharNumber(c);
            if (index != -1) table[index]++;
        }
        return table;
    }

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);
        if (a <= value && value <= z) return value - a;
        return -1;
    }
}
