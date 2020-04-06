package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class Fibonacci {
    // Time: O(2^n)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Time: O(n)
    // Space: O(n)
    public static long fibonacciDynamic(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        long[] cache = new long[n + 1];
        for (int i = 1; i < cache.length; i++) cache[i] = -1;
        cache[1] = 1;
        return fibonacci(n, cache);
    }

    private static long fibonacci(int n, long[] cache) {
        if (cache[n] > -1) return cache[n];
        cache[n] = fibonacci(n - 1, cache) + fibonacci(n - 2, cache);
        return cache[n];
    }
}
