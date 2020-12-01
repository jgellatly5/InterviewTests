package com.gallopdevs.interviewtests.projecteuler;

public class SumMultiplesThreeFive {
    public static void sumMultiplesThreeFive() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
