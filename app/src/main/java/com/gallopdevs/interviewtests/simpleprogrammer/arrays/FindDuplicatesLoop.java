package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

public class FindDuplicatesLoop {
    // How do you find the duplicate number on a given integer array?
    // How do you find duplicate numbers in an array if it contains multiple duplicates?
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
