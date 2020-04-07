package com.gallopdevs.interviewtests.questionsbytype.strings;

public class IsPermutationPalindrome {
    // Time: O(n)
    // Space: O(n)
    private static final int a = Character.getNumericValue('a');
    private static final int z = Character.getNumericValue('z');
    public static boolean isPermutationPalindrome(String text) {
        int[] table = buildCharFrequencyTable(text);
        return checkMaxOneOdd(table);
    }

    private static int[] buildCharFrequencyTable(String text) {
        int[] table = new int[z - a + 1];
        for (Character c : text.toCharArray()) {
            int index = getCharValue(c);
            if (index != -1) table[index]++;
        }
        return table;
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) return false;
                foundOdd = true;
            }
        }
        return true;
    }

    private static int getCharValue(Character c) {
        int value = Character.getNumericValue(c);
        if (a <= value && value <= z) return value - a;
        return -1;
    }
}
