package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class NotAlone {
    public static int[] notAlone(int[] numbers, int value) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == value && numbers[i - 1] != numbers[i]) {
                numbers[i] = Math.max(numbers[i - 1], numbers[i + 1]);
            }
        }
        return numbers;
    }
}
