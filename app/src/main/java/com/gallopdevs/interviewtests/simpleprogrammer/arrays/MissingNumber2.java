package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

public class MissingNumber2 {

    public static int getMissingNumber(int[] numbers, double n) {
        double expectedSum = n * ((n + 1) / 2);
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }
}
