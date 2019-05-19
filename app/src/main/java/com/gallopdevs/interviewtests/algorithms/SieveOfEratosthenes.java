package com.gallopdevs.interviewtests.algorithms;

public class SieveOfEratosthenes {

    public static void print(int upperBound) {
        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
        boolean[] isComposite = new boolean[upperBound + 1];
        for (int n = 2; n <= upperBoundSquareRoot; n++) {
            if (!isComposite[n]) {
                System.out.print(n + " ");
                for (int k = n * n; k <= upperBound; k += n) {
                    isComposite[k] = true;
                }
            }
        }
        System.out.println("\nEverything left over is prime...");
        for (int n = upperBoundSquareRoot; n <= upperBound; n++) {
            if (!isComposite[n])
                System.out.print(n + " ");
        }
    }
}
