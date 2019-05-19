package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumArraySum2 {

    public static void printPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (first + second == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
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
                set.add(target);
            } else {
                System.out.printf("(%d, %d) %n", num, target);
            }
        }
    }
}
