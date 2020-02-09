package com.gallopdevs.interviewtests.leetcode;

import com.gallopdevs.interviewtests.leetcode.IsValid;
import com.gallopdevs.interviewtests.leetcode.LongestSubstring;
import com.gallopdevs.interviewtests.leetcode.MaximumSubarray;
import com.gallopdevs.interviewtests.leetcode.MedianTwoSortedArrays;
import com.gallopdevs.interviewtests.leetcode.PalindromicSubstring;

import org.junit.Test;

import java.util.Arrays;

public class LeetCodeTest {

    @Test
    public void LongestSubstringTest() {
        System.out.println("=========LongestSubstring=========");
        String longString = "abcdefea";
        System.out.println(longString);
        System.out.println(LongestSubstring.lengthOfLongestSubstring(longString));
        String longString2 = "bbbbbbb";
        System.out.println(longString2);
        System.out.println(LongestSubstring.lengthOfLongestSubstring(longString2));
        String longString3 = "aceacef";
        System.out.println(longString3);
        System.out.println(LongestSubstring.lengthOfLongestSubstring(longString3));
        String longString4 = "pwwkew";
        System.out.println(longString4);
        System.out.println(LongestSubstring.lengthOfLongestSubstring(longString4));
    }

    @Test
    public void MedianTwoSortedArrays() {
        System.out.println("=========MedianTwoSortedArrays=========");
        int[] nums1 = new int[]{2, 5, 6};
        int[] nums2 = new int[]{3, 15};
        System.out.println("Median: " + MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
        int[] nums3 = new int[]{2, 5, 16};
        int[] nums4 = new int[]{3, 15, 20};
        System.out.println("Median: " + MedianTwoSortedArrays.findMedianSortedArrays(nums3, nums4));
        System.out.println("=========MedianTwoSortedArrays Test2=========");
        int[] nums5 = new int[]{2, 5, 6};
        int[] nums6 = new int[]{3, 15};
        System.out.println("Median: " + MedianTwoSortedArrays2.findMedian(nums1, nums2));
        int[] nums7 = new int[]{2, 5, 16};
        int[] nums8 = new int[]{3, 15, 20};
        System.out.println("Median: " + MedianTwoSortedArrays2.findMedian(nums3, nums4));
    }

    @Test
    public void LongestPalindromicSubstring() {
        System.out.println("=========LongestPalindromicSubstring=========");
        String firstCase = "babad";
        System.out.println(firstCase);
        System.out.println(PalindromicSubstring.palindromicSubstring(firstCase));
        System.out.println();
        String secondCase = "bigracecarbig";
        System.out.println(secondCase);
        System.out.println(PalindromicSubstring.palindromicSubstring(secondCase));
    }

    @Test
    public void IsValid() {
        System.out.println("=========IsValid=========");
        String firstCase = "{}[]()";
        System.out.println(firstCase);
        System.out.println(IsValid.isValid(firstCase));
        String secondCase = "{(})";
        System.out.println(secondCase);
        System.out.println(IsValid.isValid(secondCase));
    }

    @Test
    public void MaximumSubarray() {
        System.out.println("=========MaximumSubarray=========");
        int[] numbers = new int[] {2, -1, 4, -5, 6, 0, -2};
        System.out.println(Arrays.toString(numbers));
        System.out.println(MaximumSubarray.maximumSubarray(numbers));
        int[] numbers2 = new int[] {-1, 1, 2};
        System.out.println(Arrays.toString(numbers2));
        System.out.println(MaximumSubarray.maximumSubarray(numbers2));
    }
}
