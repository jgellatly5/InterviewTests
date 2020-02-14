package com.gallopdevs.interviewtests.codility;

import com.gallopdevs.interviewtests.algorithms.SelectionSort;
import com.gallopdevs.interviewtests.codility.SaddlePointMatrix;

import org.junit.Test;

import java.util.Arrays;

public class CodilityTest {

    @Test
    public void SaddlePointMatrix() {
        int[][] test = {{0, 1, 9, 3}, {7, 5, 8, 3}, {9, 2, 9, 4}, {4, 6, 7, 1}};
        System.out.println(SaddlePointMatrix.findSaddlePoints(test));

        int[][] test2 = {{0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(SaddlePointMatrix.findSaddlePoints(test2));
    }

    @Test
    public void ZipDecimal() {
        int A = 76;
        int B = 12;
        int digitCountA = 0;
        int digitCountB = 0;
        while (A > 0) {
            A /= 10;
            ++digitCountA;
        }
        while (B > 0) {
            B /= 10;
            ++digitCountB;
        }
        int[] result = new int[digitCountA + digitCountB];
        int newA = 76;
        System.out.println("remainder: " + newA % 10);
        int newB = 125;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                if (digitCountA > 0) {
                    int digitPlace = (int) Math.pow(10, digitCountA - 1);
                    if (digitPlace > 1) {
                        result[i] = newA / digitPlace;
                    } else {
                        result[i] = newA % 10;
                    }
                    digitCountA--;
                } else {
                    if (digitCountB > 0) {
                        int digitPlace = (int) Math.pow(10, digitCountB - 1);
                        if (digitPlace > 1) {
                            result[i] = newB / digitPlace;
                        } else {
                            result[i] = newB % 10;
                        }
                        digitCountB--;
                    }
                }
            } else {
                if (digitCountB > 0) {
                    int digitPlace = (int) Math.pow(10, digitCountB - 1);
                    if (digitPlace > 1) {
                        result[i] = newB / digitPlace;
                    } else {
                        result[i] = newB % 10;
                    }
                    digitCountB--;
                } else {
                    if (digitCountA > 0) {
                        int digitPlace = (int) Math.pow(10, digitCountA - 1);
                        if (digitPlace > 1) {
                            result[i] = newA / digitPlace;
                        } else {
                            result[i] = newA % 10;
                        }
                        digitCountA--;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
