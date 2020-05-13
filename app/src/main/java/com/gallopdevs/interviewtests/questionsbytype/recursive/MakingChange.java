package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class MakingChange {
    private static int[] coins = {10, 6, 1};
    // Time: O(c^n) where c = height of recursive tree, n = number of coin variations
//    public static int makeChangeNaive(int c) {
//        if (c == 0) return 0;
//        int minCoins = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            if (c - coin >= 0) {
//                int currentCoins = makeChangeNaive(c - coin);
//                if (currentCoins < minCoins) minCoins = currentCoins;
//            }
//        }
//        return minCoins + 1;
//    }

    public static int makeChange(int c) {
        int[] cache = new int[c + 1];
        for (int i = 1; i < c + 1; i++) {
            cache[i] = -1;
        }
        return makeChange(c, cache);
    }

    private  static int makeChange(int c, int[] cache) {
        if (cache[c] >= 0) return cache[c];
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (c - coin >= 0) {
                int currentCoins = makeChange(c - coin, cache);
                minCoins = Math.min(minCoins, currentCoins);
            }
        }
        cache[c] = minCoins + 1;
        return cache[c];
    }

    // Time: O(c * n)
    // Space: O(c)
    // where c = height of recursive tree, n = number of coin variations
//    public static int makeChange(int c) {
//        int[] cache = new int[c + 1];
//        for (int i = 1; i <= c; i++) {
//            int minCoins = Integer.MAX_VALUE;
//            for (int coin : coins) {
//                if (i - coin >= 0) {
//                    int currentCoins = cache[i - coin] + 1;
//                    minCoins = Math.min(minCoins, currentCoins);
//                }
//            }
//            cache[i] = minCoins;
//        }
//        return cache[c];
//    }
}
