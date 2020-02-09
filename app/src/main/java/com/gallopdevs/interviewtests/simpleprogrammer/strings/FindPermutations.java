package com.gallopdevs.interviewtests.simpleprogrammer.strings;

public class FindPermutations {

    public static void findPermutations(String str) {
        permutations("", str);
    }

    private static void permutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        for (int i = 0; i < str.length(); i++) {
            permutations(prefix + str.charAt(i),
                    str.substring(0, i) + str.substring(i + 1, n));
        }
    }
}
