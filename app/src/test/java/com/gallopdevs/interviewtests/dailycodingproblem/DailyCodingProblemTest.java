package com.gallopdevs.interviewtests.dailycodingproblem;

import com.gallopdevs.interviewtests.dailycodingchallenge.MultiplyOtherElements;

import org.junit.Test;

import java.util.Arrays;

public class DailyCodingProblemTest {

    @Test
    public void MultiplyOtherElementsTest() {
        System.out.println("===========MultiplyOtherElements===========");
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(MultiplyOtherElements.multiplyOtherElements(numbers)));
        System.out.println();
        int[] numbers2 = new int[] {3, 2, 1};
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(MultiplyOtherElements.multiplyOtherElements(numbers2)));
    }
}
