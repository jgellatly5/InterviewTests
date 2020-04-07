package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountPairsWithSum {
    // Time: O(n log(n))
    public static int countPairsWithSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int i = 0;
        int j = numbers.length - 1;
        int count = 0;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                count++;
                i++;
                j--;
                while (i < j && numbers[i] == numbers[i - 1]) {
                    i++;
                }
                while (i < j && numbers[j] == numbers[j + 1]) {
                    j--;
                }
            }
        }
        return count;
    }

    // Time: O(n)
    // Space: O(n)
    public static int countPairsWithSumSet(int[] numbers, int target) {
        Set<Integer> seen = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : numbers) {
            if (map.containsKey(num)) {
                int key = map.get(num) * 10 + num;
                if (!seen.contains(key)) {
                    count++;
                    seen.add(key);
                }
            } else {
                map.put(target - num, num);
            }
        }
        return count;
    }
}
