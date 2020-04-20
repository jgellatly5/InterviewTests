package com.gallopdevs.interviewtests.algorithms;

public class BinarySearch {
    // Time: O(log(n))
    public static int binarySearchIterative(int[] numbers, int target) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (numbers[middleIndex] < target) lowIndex = middleIndex + 1;
            else if (numbers[middleIndex] > target) highIndex = middleIndex - 1;
            else return numbers[middleIndex];
        }
        throw new IllegalStateException();
    }

    // Time: O(log(n))
    public static int binarySearchRecursive(int[] numbers, int target, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) throw new IllegalStateException();
        int middleIndex = (lowIndex + highIndex) / 2;
        if (numbers[middleIndex] < target) {
            return binarySearchRecursive(numbers, target, middleIndex + 1, highIndex);
        }
        if (numbers[middleIndex] > target) {
            return binarySearchRecursive(numbers, target, lowIndex, middleIndex - 1);
        }
        return numbers[middleIndex];
    }
}
