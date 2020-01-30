package com.gallopdevs.interviewtests.hackerrank;

public class RotationLeft {
    public static int[] rotationLeft(int[] a, int d) {
        int n = a.length;
        int[] result = new int[n];
        int rotationCount = 0;
        while (rotationCount < d) {
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    result[i] = a[0];
                } else {
                    result[i] = a[i + 1];
                }
            }
            rotationCount++;
            a = result.clone();
        }
        return result;
    }
}
