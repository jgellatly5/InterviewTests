package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.hackerrank.MinimumBribes;
import com.gallopdevs.interviewtests.hackerrank.RotationLeft;

import org.junit.Test;

import java.util.Arrays;

public class HackerRankTest {

    @Test
    public void RotationLeftTest() {
        System.out.println("=========RotationLeft=========");
        int[] numbers = new int[]{1};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(RotationLeft.rotationLeft(numbers, -1)));
    }

    @Test
    public void MinimumBribes() {
        System.out.println("=========MinimumBribes=========");
        int[] line = new int[]{2, 1, 5, 3, 4};
        MinimumBribes.minimumBribes(line);
    }
}
