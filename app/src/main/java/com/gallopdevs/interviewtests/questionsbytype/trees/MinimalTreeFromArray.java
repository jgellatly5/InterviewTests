package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class MinimalTreeFromArray {
    public static TreeNode createMinimalBst(int[] array) {
        return createMinimalBst(array, 0, array.length - 1);
    }

    private static TreeNode createMinimalBst(int[] array, int start, int end) {
        if (end < start) return null;
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(array[middle]);
        node.left = createMinimalBst(array, start, middle - 1);
        node.right = createMinimalBst(array, middle + 1, end);
        return node;
    }
}
