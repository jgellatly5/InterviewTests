package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class FindEvenAndOdd {
    public static void findEvenAndOdd(int[] numbers) {
        int odd = 0;
        int even = 0;
        for (int num : numbers) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even Count: " + even + ", Odd Count: " + odd);
    }
}
