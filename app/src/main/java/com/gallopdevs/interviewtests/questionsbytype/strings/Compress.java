package com.gallopdevs.interviewtests.questionsbytype.strings;

public class Compress {
    // Time: O(n)
    public static String compress(String text) {
        StringBuilder result = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < text.length(); i++) {
            countConsecutive++;
            if (i + 1 >= text.length() || text.charAt(i) != text.charAt(i + 1)) {
                result.append(text.charAt(i));
                result.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return result.length() < text.length() ? result.toString() : text;
    }
}
