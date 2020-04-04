package com.gallopdevs.interviewtests.codility;

public class ZipDecimal {
    public static int zipDecimal(int a, int b) {
        StringBuilder result = new StringBuilder();
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String[] aDigits = s1.split("");
        String[] bDigits = s2.split("");
        int i = 0;
        int j = 0;
        while (i < aDigits.length && j < bDigits.length) {
            result.append(aDigits[i++]);
            result.append(bDigits[j++]);
        }
        while (i < aDigits.length) {
            result.append(aDigits[i++]);
        }
        while (j < bDigits.length) {
            result.append(bDigits[j++]);
        }
        return Integer.parseInt(result.toString());
    }
}
