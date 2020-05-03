package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.BitSet;

public class PrintMissingNumbers {
    // Note: this will work if there is more than one missing element
    // Time: O(n)
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
