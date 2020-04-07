package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class Array6 {
    public static boolean array6(int[] numbers, int index) {
        if (index == numbers.length) return false;
        if (numbers[index] == 6) return true;
        else return array6(numbers, index + 1);
    }
}
