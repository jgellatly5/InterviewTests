package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMultipleDuplicates2 {
    public static void findDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void findDuplicatesSet(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void findDuplicatesCount(int[] numbers) {
        Map<Integer, Integer> numAndCount = new HashMap<>();
        Integer count = null;
        for (int num : numbers) {
            if (count == null) {
                numAndCount.put(num, 1);
            } else {
                numAndCount.put(num, ++count);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = numAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array: "
                        + entry.getKey() + ", count: "
                        + entry.getValue());
            }
        }
    }
}
