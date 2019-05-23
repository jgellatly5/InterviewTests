package com.gallopdevs.interviewtests.simpleprogrammer.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumArraySum {

    // How do you find all pairs of an integer array whose sum is equal to a given number?
    public static void printPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (first + second == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }

    public static void printPairsUsingSet(int[] numbers, int sum) {
        if (numbers.length < 2) return;
        Set set = new HashSet<>(numbers.length);
        for (int num : numbers) {
            int target = sum - num;

            if (!set.contains(target)) {
                set.add(num);
            } else {
                System.out.printf("(%d, %d) %n", num, target);
            }
        }
    }

    public static void prettyPrint(int[] givenArray, int givenSum) {
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
        printPairs(givenArray, givenSum);
    }

    public static void prettyPrintSet(int[] random, int k) {
        System.out.println("Random Integer array : " + Arrays.toString(random));
        System.out.println("Sum : " + k);
        System.out.println("pair of numbers from an array whose sum equals " + k);
        printPairsUsingSet(random, k);
    }

    public static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for(int i=0; i<length; i++) {
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }
}
