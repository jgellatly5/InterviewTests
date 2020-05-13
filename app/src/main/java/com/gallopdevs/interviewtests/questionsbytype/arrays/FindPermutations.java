package com.gallopdevs.interviewtests.questionsbytype.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPermutations {
    public static ArrayList<int[]> findPermutations(int[] numbers) {
        ArrayList<int[]> results = new ArrayList<>();
        permutations(numbers, 0, results);
        return results;
    }

    // results = [1, 2, 3]
    // permutations([1, 2, 3], 0, results)
    //               ^
    // i = 0
    // start = 0

    private static void permutations(int[] numbers, int start, ArrayList<int[]> results) {
        System.out.println("RECURSION");
        if (start >= numbers.length) {
            results.add(numbers.clone());
            System.out.println("Adding to results: start: " + start + ", " + Arrays.toString(numbers));
        }
        else {
            for (int i = start; i < numbers.length; i++) {
                swap(numbers, start, i);
                System.out.println("First swap: index: " + i + ", start: " + start + ", " + Arrays.toString(numbers));
                permutations(numbers, start + 1, results);
                swap(numbers, start, i);
                System.out.println("second swap: index: " + i + ", start: " + start + ", " + Arrays.toString(numbers));
            }
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
