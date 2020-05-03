package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class GetMissingNumber {
    // Note: this cannot be used if more than one missing number or contains duplicates
    // Note: only works for integer arrays from 1 to 100
    // Time: O(n)
    public static int getMissingNumber(int[] numbers, double totalCount) {
        double expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int num : numbers) actualSum += num;
        return (int) (expectedSum - actualSum);
    }
}
