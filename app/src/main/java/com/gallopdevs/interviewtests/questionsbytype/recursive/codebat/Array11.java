package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class Array11 {

    public static int array11(int[] numbers, int index) {
        if (index == numbers.length) return 0;
        if (numbers[index] == 11) return 1 + array11(numbers, index + 1);
        else return array11(numbers, index + 1);
    }
}
