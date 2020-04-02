package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class FindLowHighIndex {
    // Time: O(n)
    public static void findLowHighIndex(int[] numbers, int value) {
        int count = 0;
        int lowIndex = -1;
        int highIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (count == 0 && numbers[i] == value) {
                lowIndex = i;
                highIndex = i;
                count++;
            } else if (numbers[i] == value) {
                highIndex = i;
                count++;
            }
        }
        System.out.println("LowIndex: " + lowIndex);
        System.out.println("HighIndex: " + highIndex);
    }
}
