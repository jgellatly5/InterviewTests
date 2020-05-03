package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlaps {
    // Time: O(n)
    // Space: O(n)
    public static List<Integer> mergeOverlaps(List<List<Integer>> pairs) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (List<Integer> pair : pairs) {
            for (Integer num : pair) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
}
