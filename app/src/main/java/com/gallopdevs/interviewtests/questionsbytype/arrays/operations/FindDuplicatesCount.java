package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesCount {
    // Time: O(n)
    // Space: O(n)
    public static void findDuplicatesCount(int[] numbers) {
        HashMap<Integer, Integer> numAndCount = new HashMap<>();
        for (int num : numbers) {
            Integer count = numAndCount.get(num);
            if (count == null) numAndCount.put(num, 1);
            else numAndCount.put(num, ++count);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = numAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey()
                        + ", count: " + entry.getValue());
            }
        }
    }
}
