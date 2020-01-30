package com.gallopdevs.interviewtests.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static boolean isAnagramCount(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hashMap1 = getHashMap(s);
        HashMap<Character, Integer> hashMap2 = getHashMap(t);
        return hashMap1.equals(hashMap2);
    }

    private static HashMap<Character, Integer> getHashMap(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer count = hashMap.get(c);
            if (count == null) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, ++count);
            }
        }
        return hashMap;
    }
}
