package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class SecondLargest {
    // Time: O(n)
    private static void findSecondLargest(int[] numbers) {
        if (numbers.length < 2) System.out.println("Invalid size");
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && num != max) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("The second largest element does not exist");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
