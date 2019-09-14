package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintPairsSumSet2 {
    public static void printPairsSet(int[] numbers, int sum) {
        if (numbers.length < 2) return;
        Set set = new HashSet<>(numbers.length);
        for (int num : numbers) {
            int target = sum - num;
            if (!set.contains(target)) {
                set.add(num);
            } else {
                System.out.printf("(%d, %d) %n", num, target);
            }
        }
    }
}
