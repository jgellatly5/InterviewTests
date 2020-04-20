package com.gallopdevs.interviewtests.questionsbytype;

import org.junit.Test;

import java.util.Arrays;

public class ImplementationPractice {

    @Test
    public void Practice() {
        int[] test = {7, 4, 9, 10, 3, 2};
        bubbleSort(test);
    }

    public void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
