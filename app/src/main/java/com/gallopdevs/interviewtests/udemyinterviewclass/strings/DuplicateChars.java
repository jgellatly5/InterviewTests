package com.gallopdevs.interviewtests.udemyinterviewclass.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {

    public static void printDuplicateLetter(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char letter = characters[i];
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
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
