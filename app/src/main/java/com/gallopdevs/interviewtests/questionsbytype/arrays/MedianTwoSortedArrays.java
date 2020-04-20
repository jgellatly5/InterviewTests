package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    // Iterative
    // Time: O(n)
    // Space: O(n)
    public static double medianTwoSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (j < b.length && i < a.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
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
