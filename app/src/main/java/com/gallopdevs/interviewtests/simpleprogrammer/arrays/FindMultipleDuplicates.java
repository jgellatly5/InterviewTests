package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMultipleDuplicates {

    // How do you find the duplicate number on a given integer array?
    // How do you find duplicate numbers in an array if it contains multiple duplicates?
    // Solution 1:
    public static void findMultipleDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println();
    }

    // Solution 2:
    public static void findMultipleDuplicateSet(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Solution 3:
    public static void findMultipleDuplicatesAndCount(int[] numbers) {
        Map<Integer, Integer> numAndCount= new HashMap<>();
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
                System.out.println("Duplicate element from array: " +
                        entry.getKey() + ", count: " + entry.getValue());
            }
        }
    }
}
