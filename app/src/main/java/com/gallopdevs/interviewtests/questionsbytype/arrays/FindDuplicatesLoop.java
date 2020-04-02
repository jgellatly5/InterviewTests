package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class FindDuplicatesLoop {
    // Time: O(n^2)
    public static void findDuplicatesLoop(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
