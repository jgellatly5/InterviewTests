package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingLinkedHashMap {
    public static void firstNonRepeat(int[] numbers) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] == numbers[i]) {
                linkedHashMap.put(numbers[i - 1], ++count);
            } else {
                linkedHashMap.put(numbers[i], 1);
                count = 1;
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = linkedHashMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("All repeating.");
    }
}
