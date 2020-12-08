package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class SecondSmallest {
    // Time: O(n)
    public static void findSecondSmallest(int[] numbers) {
        if (numbers.length < 2) System.out.println("Invalid size");
        int min = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                secondSmallest = min;
                min = num;
            } else if (num < secondSmallest && num != min) {
                secondSmallest = num;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }
}
