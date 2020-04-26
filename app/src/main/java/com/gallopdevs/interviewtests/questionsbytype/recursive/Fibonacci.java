package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class Fibonacci {
    // F: First Solution
    //    public static int fibonacciRecursive(int n) {
    //        if (n <= 1) return n;
    //        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    //    }
    // A: Analyze the First Solution
    // Time: O(2^n)
    // Space: O(n)
    // S: Identify Subproblems
    // Time: O(n)
    // Space: O(n)
    //    public static int fib(int n) {
    //        if (n < 2) return n;
    //        // Create cache and initialize to -1
    //        int[] cache = new int[n+1];
    //        for (int i = 0; i < cache.length; i++) {
    //            cache[i] = -1;
    //        }
    //        // Fill initial values in cache
    //        cache[0] = 0;
    //        cache[1] = 1;
    //        return fib(n, cache);
    //    }
    //    // Overloaded private method
    //    private static int fib(int n, int[] cache) {
    //        // If value is set in cache, return
    //        if (cache[n] >= 0) return cache[n];
    //        // Compute and add to cache before returning
    //        cache[n] = fib(n-1, cache) + fib(n-2, cache);
    //        return cache[n];
    //    }
    // T: Top-Down -> Bottom-Up Solution
    // Time: O(n)
    // Space: O(n)
    public static int fib(int n) {
        if (n == 0) return 0;
        // Initialize cache
        int[] cache = new int[n + 1];
        cache[1] = 1;
        // Fill cache iteratively
        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
