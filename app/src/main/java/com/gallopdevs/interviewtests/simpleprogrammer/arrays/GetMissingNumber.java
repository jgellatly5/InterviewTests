package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

public class GetMissingNumber {
    // How do you find the missing number in a given integer array of 1 to 100?
    // cannot be used if more than one missing number or contains duplicates
    public static int getMissingNumber(int[] numbers, double totalCount) {
        double expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int num : numbers) actualSum += num;
        return (int) (expectedSum - actualSum);
    }
}
