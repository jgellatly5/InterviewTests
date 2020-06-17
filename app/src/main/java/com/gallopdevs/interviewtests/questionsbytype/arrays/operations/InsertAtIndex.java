package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class InsertAtIndex {
    public static int[] insert(int[] numbers, int index, int value) {
        int[] result = new int[numbers.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = numbers[i];
        }
        result[index] = value;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = numbers[i - 1];
        }
        return result;
    }
}
