package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class MergeSortedArray {
    // Time: O(n)
    public static void mergeSortedArray(int[] a, int[] b, int aLength, int bLength) {
        if (aLength + bLength > a.length) throw new IllegalStateException();
        int aIndex = aLength - 1;
        int bIndex = bLength - 1;
        int mergeIndex = aLength + bLength - 1;
        while (aIndex >= 0 && bIndex >= 0) {
            if (a[aIndex] > b[bIndex]) {
                a[mergeIndex--] = a[aIndex--];
            } else {
                a[mergeIndex--] = b[bIndex--];
            }
        }
        while (bIndex >= 0) {
            a[mergeIndex--] = b[bIndex--];
        }
    }
}
