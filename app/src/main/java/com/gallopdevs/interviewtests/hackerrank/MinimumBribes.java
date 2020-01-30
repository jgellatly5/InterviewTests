package com.gallopdevs.interviewtests.hackerrank;

public class MinimumBribes {
    public static void minimumBribes(int[] queue) {
        int bribes = 0;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (queue[i] - (i + 1) > 0) {
                bribes += queue[i] - (i + 1);
            }
        }
        System.out.println(bribes);
    }
}
