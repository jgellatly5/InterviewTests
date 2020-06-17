package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class PrintPairsSumLoop {
    // Time: O(n^2)
    public static void printPairs(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int first = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int second = numbers[j];
                if (first + second == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }
}
