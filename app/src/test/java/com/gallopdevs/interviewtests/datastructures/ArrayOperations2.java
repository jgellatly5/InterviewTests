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
        int[] numbers = {7, 8, 0, 0, 0, 0, 0, 9, 10, 11};
        moveZeros(numbers);
    }

    private void moveZeros(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num != 0) {
                numbers[count++] = num;
            }
        }
        while (count < numbers.length) {
            numbers[count++] = 0;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
