package com.gallopdevs.interviewtests.algorithms;

public class RadixSort {

    public static void radixSort(int[] array) {
        int i;
        int key = array[0];
        int digit = 1;

        int[] sorted = new int[10];

        for (i = 1; i < array.length; i++) {
            if (array[i] > key) {
                key = array[i];
            }
        }

        while (key / digit > 0) {
            int[] bucket = new int[10];

            for (i = 0; i < array.length; i++) {
                bucket[(array[i] / digit) % 10]++;
            }
            for (i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (i = array.length - 1; i >= 0; i--) {
                sorted[--bucket[(array[i] / digit) % 10]] = array[i];
            }
            for (i = 0; i < array.length; i++) {
                array[i] = sorted[i];
            }
            digit *= 10;
        }
        print(array);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
