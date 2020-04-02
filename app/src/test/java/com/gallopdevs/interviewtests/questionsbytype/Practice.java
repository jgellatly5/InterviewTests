package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.arrays.codebat.MidThree;
import com.gallopdevs.interviewtests.questionsbytype.trees.FindHeight;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Practice {

    private FindHeight.Node node;

    @Before
    public void Setup() {
        node = new FindHeight.Node(5);
        node.left = new FindHeight.Node(2);
        node.right = new FindHeight.Node(7);
        node.left.left = new FindHeight.Node(1);
        node.left.right = new FindHeight.Node(3);
        node.right.left = new FindHeight.Node(6);
        node.right.right = new FindHeight.Node(8);
    }

    @Test
    public void PracticeTest() {
        System.out.println("=========MidThree=========");
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {8, 6, 7, 5, 3, 0, 9};
        int[] test3 = {1, 2, 3};
        System.out.println(Arrays.toString(MidThree.midThree(test1)));
        System.out.println(Arrays.toString(MidThree.midThree(test2)));
        System.out.println(Arrays.toString(MidThree.midThree(test3)));
    }
}
