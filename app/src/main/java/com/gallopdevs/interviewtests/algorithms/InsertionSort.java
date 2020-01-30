package com.gallopdevs.interviewtests.algorithms;

public class InsertionSort {

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j;
            for (j = i - 1; (j >= 0 && numbers[j] > key); j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = key;
        }
        print(numbers);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
