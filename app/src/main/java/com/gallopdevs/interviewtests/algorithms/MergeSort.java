package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(array, left, middle);
            sort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {

        int sizeOne = middle - left + 1;
        int sizeTwo = right - middle;

        int[] leftArray = new int[sizeOne];
        int[] rightArray = new int[sizeTwo];

        for (int i = 0; i < sizeOne; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeTwo; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < sizeOne && j < sizeTwo) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < sizeOne) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < sizeTwo) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array));
    }
}
