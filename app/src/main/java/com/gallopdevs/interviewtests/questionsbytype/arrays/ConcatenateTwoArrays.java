package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class ConcatenateTwoArrays {
    public static int[] concatenateTwoArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        // position 1 = source array
        // position 2 = starting position of source array
        // position 3 = destination array
        // position 4 = starting position of destination array
        // position 5 = number of elements to be copied
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}
