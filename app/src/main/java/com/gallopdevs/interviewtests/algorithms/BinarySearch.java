package com.gallopdevs.interviewtests.algorithms;

public class BinarySearch {
    public static int binarySearchIterative(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (numbers[middle] < target) {
                low = middle + 1;
            } else if (numbers[middle] > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] numbers, int target, int low, int high) {
        if (low > high) return -1;
        int middle = (low + high) / 2;
        if (numbers[middle] < target) {
            return binarySearchRecursive(numbers, target, middle + 1, high);
        } else if (numbers[middle] > target) {
            return binarySearchRecursive(numbers, target, low, middle - 1);
        } else {
            return middle;
        }
    }
}
