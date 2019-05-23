package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumArraySum2 {

    public static void printPairs(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    System.out.printf("(%d, %d) %n", numbers[i], numbers[j]);
                }
            }
        }
    }

    public static void printPairsUsingSet(int[] numbers, int sum) {
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
