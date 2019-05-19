package com.gallopdevs.interviewtests.udemyinterviewclass.classic;

public class Stocks2 {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return -1;
        }

        int min = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return result;
    }
}
