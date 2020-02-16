package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.BitSet;

public class PrintMissingNumbers {
    // more than one missing element
    public static void printMissingNumbers(int[] numbers, int n) {
        int missingCount = n - numbers.length;
        BitSet bitSet = new BitSet(n);
        for (int num : numbers) {
            // sets the value of the bit passed in to true
            bitSet.set(num - 1);
        }
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            // finds the first bit in the set that is set to false
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.print(++lastMissingIndex + " ");
        }
        System.out.println();
    }
}
