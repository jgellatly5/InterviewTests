package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

public class PrintPairsSumLoop {
    // How do you find all pairs of an integer array whose sum is equal to a given number?
    public static void printPairs(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
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
