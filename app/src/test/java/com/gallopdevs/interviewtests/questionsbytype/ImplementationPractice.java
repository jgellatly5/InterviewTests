package com.gallopdevs.interviewtests.questionsbytype;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

public class ImplementationPractice {

    @Test
    public void Practice() {
        int[] test1 = {27, 1, 34, 9, 2};
        Integer[] test2 = {4, 4, 4, 4};
        System.out.println(findSecondLargest(test1));
    }

    private int findSecondLargest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && max != num) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
