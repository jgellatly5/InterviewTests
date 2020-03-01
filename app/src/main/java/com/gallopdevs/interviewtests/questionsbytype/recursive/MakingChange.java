package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class MakingChange {

    // This is assuming American coin system
    // Using generic coin system, recursive calls = exponential time
    // Use cache (Dynamic Programming) to save previous values from recursive calls
    public static int changeIterative(int value) {
        int numberOfCoins = 0;
        while (value - 50 >= 0) {
            numberOfCoins++;
            value -= 50;
            System.out.println("Adding 50cent coin");
        }
        while (value - 25 >= 0) {
            numberOfCoins++;
            value -= 25;
            System.out.println("Adding 25cent coin");
        }
        while (value - 10 >= 0) {
            numberOfCoins++;
            value -= 10;
            System.out.println("Adding 10cent coin");
        }
        while (value - 5 >= 0) {
            numberOfCoins++;
            value -= 5;
            System.out.println("Adding 5cent coin");
        }
        while (value - 1 >= 0) {
            numberOfCoins++;
            value -= 1;
            System.out.println("Adding 1cent coin");
        }
        return numberOfCoins;
    }

    public static int changeRecursive(int value) {
        if (value - 50 >= 0) return changeRecursive(value - 50) + 1;
        else if (value - 25 >= 0) return changeRecursive(value - 25) + 1;
        else if (value - 10 >= 0) return changeRecursive(value - 10) + 1;
        else if (value - 5 >= 0) return changeRecursive(value - 5) + 1;
        else if (value - 1 >= 0) return changeRecursive(value - 1) + 1;
        else return 0;
    }
}
