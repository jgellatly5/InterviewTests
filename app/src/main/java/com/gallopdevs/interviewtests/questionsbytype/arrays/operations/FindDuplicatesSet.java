package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.HashSet;

public class FindDuplicatesSet {
    // Time: O(n)
    // Space: O(n)
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
