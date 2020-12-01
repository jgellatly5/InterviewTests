package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class FindDuplicatesLoop {
    // Time: O(n^2) - Only works when duplicates are pairs
    public static void findDuplicatesLoop(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
