package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class RotateLeft {
    // Time: O(n)
    public static int[] rotateLeft(int[] numbers) {
        int temp = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = temp;
        return numbers;
    }
}
