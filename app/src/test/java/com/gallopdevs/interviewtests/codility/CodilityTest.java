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
        System.out.println(ZipDecimal.zipDecimal(53, 14));
        System.out.println(ZipDecimal.zipDecimal(62, 777));
    }
}
