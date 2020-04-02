package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ConsecutiveArray {
    // Time: O(n)
    // Space: O(n)
    public static int consecutiveArraySet(int[] numbers) {
        HashSet<Integer> values = new HashSet<>();
        for (int num : numbers) {
            values.add(num);
        }
        int maxLength = 0;
        for (int i : values) {
            if (values.contains(i - 1)) continue;
            int length = 0;
            while (values.contains(i++)) length++;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    // Time: O(n log n)
    // Space: O(1)
    public static int consecutiveArraySort(int[] numbers) {
        Arrays.sort(numbers);
        int currentLength = 1;
        int maxLength = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] == numbers[i] + 1) {
                ++currentLength;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
}
