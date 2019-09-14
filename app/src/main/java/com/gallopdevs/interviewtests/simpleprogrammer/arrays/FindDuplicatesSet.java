package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashSet;

public class FindDuplicatesSet {
    public static void findDuplicatesSet(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
