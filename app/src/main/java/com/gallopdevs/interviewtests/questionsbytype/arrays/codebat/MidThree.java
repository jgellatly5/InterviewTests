package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class MidThree {
    public static int[] midThree(int[] numbers) {
        int middle = numbers.length / 2;
        int leftOfMiddle = middle - 1;
        int rightOfMiddle = middle + 1;
        return new int[]{
                numbers[leftOfMiddle],
                numbers[middle],
                numbers[rightOfMiddle]
        };
    }
}
