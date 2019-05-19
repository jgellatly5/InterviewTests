package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.Arrays;

public class RemoveDuplicates2 {

    public static int[] removeDuplicates(int[] numbersWithDuplicates) {
        Arrays.sort(numbersWithDuplicates);
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;
        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int current = numbersWithDuplicates[i];
            if (previous != current) {
                result[i] = current;
            }
            previous = current;
        }
        return result;
    }
}
