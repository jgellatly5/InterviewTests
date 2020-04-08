package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountPairsWithSum {
    // https://leetcode.com/discuss/interview-question/372434
    // Time: O(n log(n))
    public static int countPairsWithSum(int[] numbers, int sum) {
        Arrays.sort(numbers);
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        int count = 0;
        while (startIndex < endIndex) {
            int target = numbers[startIndex] + numbers[endIndex];
            if (target < sum) startIndex++;
            else if (target > sum) endIndex--;
            else {
                count++;
                startIndex++;
                endIndex--;
                while (startIndex < endIndex && numbers[startIndex] == numbers[startIndex - 1]) {
                    startIndex++;
                }
                while (startIndex < endIndex && numbers[endIndex] == numbers[endIndex + 1]) {
                    endIndex--;
                }
            }
        }
        return count;
    }

    // Time: O(n)
    // Space: O(n)
    public static int countPairsWithSumSet(int[] numbers, int target) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        int count = 0;
        for (int num : numbers) {
            if (set.contains(target - num) && !seen.contains(num)) {
                count++;
                seen.add(target - num);
                seen.add(num);
            } else set.add(num);
        }
        return count;
    }
}
