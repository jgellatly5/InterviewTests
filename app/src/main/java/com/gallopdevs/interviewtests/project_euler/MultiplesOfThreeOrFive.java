package com.gallopdevs.interviewtests.project_euler;

public class MultiplesOfThreeOrFive {

    public static int threeOrFive() {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
        return result;
    }
}
