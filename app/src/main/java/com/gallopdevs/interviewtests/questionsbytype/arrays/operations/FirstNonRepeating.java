package com.gallopdevs.interviewtests.questionsbytype.arrays.operations;

public class FirstNonRepeating {
    public static int firstNonRepeating(int[] nums) {
        boolean repeating = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && nums[i] != nums[i - 1]) return nums[i];
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] != nums[j] && !repeating) {
                    return nums[i];
                }
                if (nums[i] == nums[j]) {
                    repeating = true;
                    j++;
                } else {
                    repeating = false;
                    break;
                }
            }
            i = j - 1;
        }
        return -1;
    }
    // repeating = false
    // nums = [1, 1, 3, 3, 5]
    //                     i
    //                     j
}
