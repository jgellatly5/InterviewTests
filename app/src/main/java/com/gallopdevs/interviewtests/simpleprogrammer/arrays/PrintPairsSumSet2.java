package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintPairsSumSet2 {
    public static void printPairsSet(int[] numbers, int sum) {
        if (numbers.length < 2) return;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : numbers) {
            int target = sum - num;
            if (!hashSet.contains(target)) {
                hashSet.add(num);
            } else {
                System.out.printf("(%d, %d) %n", num, target);
            }
        }
    }
}
