package com.gallopdevs.interviewtests.udemyinterviewclass.classic;

import java.util.HashMap;

public class HarmlessRansomeNote {

    public boolean canWrite(String note, String letters) {

        String notesNoSpaces = note.replaceAll("\\s+", "");

        HashMap<String, Integer> notesMap = map(notesNoSpaces);
        HashMap<String, Integer> lettersMap = map(letters);

        return canWriteRansom(notesMap, lettersMap);
    }

    private HashMap<String,Integer> map(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            String character = String.valueOf(characters[i]);

            if (map.containsKey(character)) {
                Integer currentCount = map.get(character);
                map.put(character, currentCount + 1);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }

    private boolean canWriteRansom(HashMap<String, Integer> noteMap, HashMap<String, Integer> letterMap) {
        for (String key : noteMap.keySet()) {
            if (!letterMap.containsKey(key)) {
                return false;
            }

            int noteCount = noteMap.get(key);
            int letterCount = letterMap.get(key);

            if (letterCount < noteCount) {
                return false;
            }
        }
        return true;
    }
}
