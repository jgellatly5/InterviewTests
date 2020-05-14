package com.gallopdevs.interviewtests.questionsbytype.strings;

public class CountDecoding {
    // https://www.geeksforgeeks.org/count-possible-decodings-given-digit-sequence/
    // Time: O(2^n)
    public static int countDecoding(char[] digits, int n) {
        if (n == 0 || n == 1) return 1;
        int count = 0;
        if (digits[n - 1] > '0') {
            count = countDecoding(digits, n - 1);
        }
        if (digits[n - 2] == '1' ||
                (digits[n - 2] == '2' && digits[n - 1] < '7')) {
            count += countDecoding(digits, n - 2);
        }
        return count;
    }

    // Dynamic Programming
    // Time: O(n)
    // Space: O(n)
    public static int countDecodingDynamic(char[] digits, int n) {
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= n; i++) {
            count[i] = 0;
            if (digits[n - 1] > '0') count[i] = count[i - 1];
            if (digits[n - 2] == '1' ||
                    (digits[n - 2] == '2' && digits[n - 1] < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}
