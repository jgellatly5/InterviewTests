package com.gallopdevs.interviewtests.leetcode;

import java.util.Arrays;

public class MedianTwoSortedArrays2 {
    public static double findMedian(int[] a, int[] b) {
        int[] result = concat(a, b);
        double median;
        int middle = result.length / 2;
        if (result.length % 2 == 0) {
            median = ((double) result[middle] + (double) result[middle - 1]) / 2;
        } else {
            median = (double) result[middle];
        }
        return median;
    }

    private static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        Arrays.sort(result);
        return result;
    }
}
