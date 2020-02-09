package com.gallopdevs.interviewtests.datastructures;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ArrayOperations2 {

    @Test
    public void Practice() {
        int[] numbers = {1, 2, 3, 4, 5};
        int indexToRemove = 1;
        int[] smaller = new int[numbers.length - 1];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i == indexToRemove) continue;
            smaller[j++] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(smaller));
    }
}
