package com.gallopdevs.interviewtests.questionsbytype.arrays;

public class StockPrices {
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
}
