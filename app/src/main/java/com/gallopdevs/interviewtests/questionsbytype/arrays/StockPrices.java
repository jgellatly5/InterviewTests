package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class StockPrices {
    // You have a list of stocks
    // Example: [12, 2, 7, 20, 5] -> 13
    // Time: O(n^2)
    // 0, 1, 2
    public static int findMaxProfit(int[] numbers) {
        if (numbers.length <= 1) return 0;
        int globalMax = 0;
        int currentMax;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    currentMax = numbers[j] - numbers[i];
                } else {
                    currentMax = 0;
                }
                globalMax = Math.max(currentMax, globalMax);
            }
        }
        return globalMax;
    }

    // Time: O(n)
    public static int maxProfit(int[] stockPrices) {
        int minimumPrice = Integer.MAX_VALUE; // min so far
        int maxProfit = 0;
        for (int i = 1; i < stockPrices.length; i++) {
            maxProfit = Math.max(maxProfit, stockPrices[i] - minimumPrice);
            minimumPrice = Math.min(minimumPrice, stockPrices[i]);
        }
        return maxProfit;
    }

    // 1. Understand
    // 2. Exmaple
    // 3. Brute force solution
    // variable currentProfit
    // vairable maxProfit
    // 4. Optimize
    // 5. Approach
    // 6. Coding
}
