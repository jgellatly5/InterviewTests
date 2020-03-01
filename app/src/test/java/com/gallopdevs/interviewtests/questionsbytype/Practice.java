package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.questionsbytype.trees.FindHeight;

import org.junit.Before;
import org.junit.Test;

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
        System.out.println("=========Matrix=========");
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(findProductArray(matrix));
    }

    private int findProductArray(int[][] matrix) {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == matrix[0].length - 1) {
                    product *= matrix[i][j];
                    break;
                } else if (i == matrix.length - 1) {
                    product *= matrix[i][j];
                    break;
                }
            }
        }
        return product;
    }
}
