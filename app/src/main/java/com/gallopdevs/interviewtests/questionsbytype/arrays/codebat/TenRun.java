package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class TenRun {
    public static int[] tenRun(int[] numbers) {
        int multOfTen = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 10 == 0) multOfTen = numbers[i];
            else if (multOfTen != -1) numbers[i] = multOfTen;
        }
        return numbers;
    }
}
