package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class MinimalTreeFromArray {
    // Time: O(n)
    // Space: O(n)
    public static BinarySearchTree.TreeNode createMinimalBst(int[] array) {
        return createMinimalBst(array, 0, array.length - 1);
    }

    private static BinarySearchTree.TreeNode createMinimalBst(int[] array, int start, int end) {
        if (end < start) return null;
        int middle = (start + end) / 2;
        BinarySearchTree.TreeNode node = new BinarySearchTree.TreeNode(array[middle]);
        node.left = createMinimalBst(array, start, middle - 1);
        node.right = createMinimalBst(array, middle + 1, end);
        return node;
    }
}
