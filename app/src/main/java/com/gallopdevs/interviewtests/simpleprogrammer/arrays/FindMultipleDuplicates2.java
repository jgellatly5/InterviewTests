package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMultipleDuplicates2 {

    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void findDuplicatesWithSet(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }

    public static void findDuplicatesAndCount(int[] numbers) {
        Map<Integer, Integer> numAndCount = new HashMap<>();
        for (int num : numbers) {
            Integer count = numAndCount.get(num);
            if (count == null) {
                numAndCount.put(num, 1);
            } else {
                numAndCount.put(num, ++count);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = numAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element in array: " +
                        entry.getKey() + ", count: " + entry.getValue());
            }
        }
    }
}
