package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_one;

public class One_Four_A {

    public static boolean isPermutationPalindrome(String text) {
        int[] table = buildCharFrequencyTable(text);
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
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int index = getCharNumber(c);
            if (index != -1) {
                table[index]++;
            }
        }
        return table;
    }

    private static int getCharNumber(char c) {
        int z = Character.getNumericValue('z');
        int a = Character.getNumericValue('a');
        int value = Character.getNumericValue(c);
        if (a <= value && value <= z) {
            return value - a;
        }
        return -1;
    }
}
