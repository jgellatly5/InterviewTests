package com.gallopdevs.interviewtests.leetcode;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    // Best time: 42 minutes
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedNums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedNums, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedNums, nums1.length, nums2.length);
        Arrays.sort(combinedNums);
        System.out.println(Arrays.toString(combinedNums));
        if (combinedNums.length % 2 == 1) {
            return combinedNums[(combinedNums.length - 1) / 2];
        } else {
            int middle1 = combinedNums[(combinedNums.length - 1) / 2];
            System.out.println("Middle 1: " + middle1);
            int middle2 = combinedNums[(combinedNums.length) / 2];
            System.out.println("Middle 2: " + middle2);
            return (double) (middle1 + middle2) / 2;
        }
    }
}
