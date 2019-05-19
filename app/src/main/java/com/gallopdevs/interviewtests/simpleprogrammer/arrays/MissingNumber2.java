package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.BitSet;

public class MissingNumber2 {

    public static int getMissingNumber(int[] numbers, int n) {
        int expectedSum = n * ((n + 1) / 2);
        int averageSum = 0;
        for (int num : numbers) {
            averageSum += num;
        }
        return expectedSum - averageSum;
    }

    public static void printMissingNumbers(int[] numbers, int n) {
        int missingCount = n - numbers.length;
        BitSet bitSet = new BitSet(n);
        for (int num : numbers) {
            bitSet.set(num - 1);
        }

        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
