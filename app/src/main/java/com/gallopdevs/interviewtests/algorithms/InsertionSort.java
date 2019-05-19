package com.gallopdevs.interviewtests.algorithms;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; (j >= 0 && array[j] > key); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
        print(array);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
