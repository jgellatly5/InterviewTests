package com.gallopdevs.interviewtests.algorithms;

public class BinarySearch2 {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (array[middle] < target) {
                low = middle + 1;
            } else if (array[middle] > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int target, int low, int high) {
        if (low >= high) return -1;
        int middle = (low + high) / 2;
        if (array[middle] < target) {
            return binarySearchRecursive(array, target, middle + 1, high);
        } else if (array[middle] > target) {
            return binarySearchRecursive(array, target, low, middle - 1);
        } else {
            return middle;
        }
    }
}
