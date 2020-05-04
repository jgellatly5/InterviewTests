package com.gallopdevs.interviewtests.questionsbytype.strings.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {
    // Time: O(n)
    // Space: O(n)
    public static void printDuplicateLetter(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] characters = text.toCharArray();
        for (char character : characters) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        System.out.printf("These are the list of duplicate characters in String '%s' %n", text);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
