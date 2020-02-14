package com.gallopdevs.interviewtests.simpleprogrammer.recursive;

public class Fibonacci {

    public static int fib(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fib(num - 2) + fib(num - 1);
        }
    }
}
