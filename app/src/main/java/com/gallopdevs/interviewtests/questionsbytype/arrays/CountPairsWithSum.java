package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.HashSet;

public class CountPairsWithSum {
    // Fix
    public static int countPairsWithSum(int[] numbers, int sum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            int first = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int second = numbers[j];
                if (first + second == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                    hashSet.add(first);
                    hashSet.add(second);
                }
            }
        }
        return (hashSet.size() + 1) / 2;
    }
}
