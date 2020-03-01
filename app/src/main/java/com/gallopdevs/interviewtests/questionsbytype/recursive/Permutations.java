package com.gallopdevs.interviewtests.questionsbytype.recursive;

import java.util.ArrayList;

public class Permutations {

    public static ArrayList<String> permutationsString(String s) {
        ArrayList<String> results = new ArrayList<>();
        permutationsString("", s, results);
        return results;
    }

    private static void permutationsString(String prefix, String suffix, ArrayList<String> results) {
        if (suffix.length() == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                permutationsString(
                        prefix + suffix.charAt(i),
                        suffix.substring(0, i) + suffix.substring(i + 1, suffix.length()),
                        results
                );
            }
        }
    }

    public static ArrayList<int[]> permutationsInt(int[] numbers) {
        ArrayList<int[]> results = new ArrayList<>();
        permutationsInt(numbers, 0, results);
        return results;
    }

    private static void permutationsInt(int[] numbers, int start, ArrayList<int[]> results) {
        if (start >= numbers.length) {
            results.add(numbers.clone());
        } else {
            for (int i = start; i < numbers.length; i++) {
                swap(numbers, start, i);
                permutationsInt(numbers, start + 1, results);
                swap(numbers, start, i);
            }
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
