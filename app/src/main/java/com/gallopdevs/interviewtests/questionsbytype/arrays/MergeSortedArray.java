package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class MergeSortedArray {
    // Time: O(n) (back)
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

    // Time: O(n) (front)
    // Space: O(n)
    private static int[] mergeSortedArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) {
            result[k] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }
}
