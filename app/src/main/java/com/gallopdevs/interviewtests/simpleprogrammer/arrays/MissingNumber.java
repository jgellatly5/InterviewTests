package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.BitSet;

public class MissingNumber {

    // How do you find the missing number in a given integer array of 1 to 100?
    // cannot be used if more than one missing number or contains duplicates
    public static int getMissingNumber(int[] numbers, double totalCount) {
        double expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }
    // more than one missing element
    public static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int num : numbers) {
            // sets the value of the bit passed in to true
            bitSet.set(num - 1);
        }

        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            // finds the first bit in the set that is set to false
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
