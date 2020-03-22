package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class ShiftLeft {
    public static int[] shiftLeft(int[] numbers) {
        if (numbers.length <= 1) return numbers;
        int front = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = front;
        return numbers;
    }
}
