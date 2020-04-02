package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    // Iterative
    // Time: O(n)
    // Space: O(n)
    public static double medianTwoSortedArrays(int[] numbers1, int[] numbers2) {
        int[] result = new int[numbers1.length + numbers2.length];
        int index1 = 0;
        int index2 = 0;
        int resultIndex = 0;
        while (index2 < numbers2.length && index1 < numbers1.length) {
            if (numbers1[index1] < numbers2[index2]) {
                result[resultIndex++] = numbers1[index1++];
            } else {
                result[resultIndex++] = numbers2[index2++];
            }
        }
        while (index1 < numbers1.length) {
            result[resultIndex++] = numbers1[index1++];
        }
        while (index2 < numbers2.length) {
            result[resultIndex++] = numbers2[index2++];
        }
        System.out.println(Arrays.toString(result));
        double median;
        int middleIndex = (result.length - 1) / 2;
        int middleEven = middleIndex + 1;
        if (result.length % 2 == 0) {
            median = (double)(result[middleEven] + result[middleIndex]) / 2;
        } else {
            median = result[middleIndex];
        }
        return median;
    }

    // recursive
}
