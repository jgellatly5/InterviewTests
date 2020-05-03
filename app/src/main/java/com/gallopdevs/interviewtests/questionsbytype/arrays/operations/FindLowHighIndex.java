package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class FindLowHighIndex {
    // Time: O(n)
    public static void findLowHighIndex(int[] numbers, int value) {
        int lowIndex = -1;
        int highIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                if (lowIndex == -1) {
                    lowIndex = i;
                }
                highIndex = i;
            }
        }
        System.out.println("LowIndex: " + lowIndex);
        System.out.println("HighIndex: " + highIndex);
    }
}
