package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ConsecutiveArray {
    // Time: O(n)
    // Space: O(n)
    public static int consecutiveArraySet(int[] numbers) {
        HashSet<Integer> setValues = new HashSet<>();
        for (int num : numbers) {
            setValues.add(num);
        }
        int maxLength = 0;
        for (int value : setValues) {
            if (setValues.contains(value - 1)) continue;
            int currentLength = 0;
            while (setValues.contains(value++)) currentLength++;
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    // Time: O(n log n)
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
