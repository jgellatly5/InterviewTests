package com.gallopdevs.interviewtests.algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            sort(numbers, lowIndex, middleIndex);
            sort(numbers, middleIndex + 1, highIndex);
            merge(numbers, lowIndex, middleIndex, highIndex);
        }
    }

    private static void merge(int[] numbers, int lowIndex, int middleIndex, int highIndex) {
        int sizeOne = middleIndex - lowIndex + 1;
        int sizeTwo = highIndex - middleIndex;

        int[] leftArray = new int[sizeOne];
        int[] rightArray = new int[sizeTwo];

        for (int i = 0; i < sizeOne; i++) {
            leftArray[i] = numbers[lowIndex + i];
        }

        for (int j = 0; j < sizeTwo; j++) {
            rightArray[j] = numbers[middleIndex + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = lowIndex;
        while (i < sizeOne && j < sizeTwo) {
            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < sizeOne) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < sizeTwo) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
