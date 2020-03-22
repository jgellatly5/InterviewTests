package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

public class ModThree {
    public static boolean modThree(int[] numbers) {
        int countOdd = 0;
        for (int num : numbers) {
            if (num % 2 == 1) ++countOdd;
            else countOdd = 0;
            if (countOdd == 3) return true;
        }
        int countEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) ++countEven;
            else countEven = 0;
            if (countEven == 3) return true;
        }
        return false;
    }
}
