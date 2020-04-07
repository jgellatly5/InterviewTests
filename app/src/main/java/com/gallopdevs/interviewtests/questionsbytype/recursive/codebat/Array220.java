package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class Array220 {
    public static boolean array220(int[] numbers, int index) {
        if (index == numbers.length || numbers.length == 0) return false;
        if (index == 0) return array220(numbers, index + 1);
        if (numbers[index] == (numbers[index - 1]) * 10) return true;
        return array220(numbers, index + 1);
    }
}
