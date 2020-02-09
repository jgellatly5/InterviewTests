package com.gallopdevs.interviewtests.algorithms;

import org.junit.Test;

public class Recursion {

    @Test
    public void NthPowerOfTen() {
        for (int i = 0; i < 5; i++) {
            System.out.print(powerOfTen(i) + " ");
        }
    }

    @Test
    public void Fibonacci() {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    @Test
    public void DecimalToBinary() {
        for (int i = 0; i < 10; i++) {
            System.out.println(decimalToBinary(i));
        }
    }

    @Test
    public void PrintRecursively() {
        printRecursively(5);
    }

    @Test
    public void PrintTriangle() {
        System.out.println("=========Print Triangle Recursively=========");
        printStars(5);
    }

    private int powerOfTen(int n) {
        if (n == 0) return 1;
        return powerOfTen(n - 1) * 10;
    }

    private int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private String decimalToBinary(int n) {
        if (n <= 1) return String.valueOf(n);
        return decimalToBinary(n / 2) + (n % 2);
    }

    private void printRecursively(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printRecursively(n - 1);
    }

    private void printRecursively2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        int i = 1;
        printRecursively(n - 1);
        System.out.println();
    }

    private void printTriangle(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printStars(int n) {
        if (n < 1) return;
        printRows(n);
        System.out.println();
        printStars(n - 1);
    }

    private static void printRows(int n) {
        if (n < 1) return;
        System.out.print("* ");
        printRows(n - 1);
    }
}
