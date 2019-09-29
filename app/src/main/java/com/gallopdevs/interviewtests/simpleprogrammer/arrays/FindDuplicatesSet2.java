package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashSet;

public class FindDuplicatesSet2 {
    public static void findDuplicatesSet(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : numbers) {
            if (!hashSet.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
