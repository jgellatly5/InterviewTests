package com.gallopdevs.interviewtests.leetcode;

public class MaximumSubarray {
    public static int maximumSubarray(int[] numbers) {
        int maxSum = numbers[0];
        int currentSum = 0;
        for (int num : numbers) {
            currentSum += num;
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
