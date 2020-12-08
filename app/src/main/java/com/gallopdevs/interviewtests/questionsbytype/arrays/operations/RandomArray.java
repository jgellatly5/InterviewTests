package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class RandomArray {
    public static int[] getRandomArray(int length) {
        int[] randomNums = new int[length];
        for (int i = 0; i < length; i++) {
            randomNums[i] = (int) (Math.random() * 15);
        }
        return randomNums;
    }
}
