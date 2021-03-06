package com.gallopdevs.interviewtests.questionsbytype.trees;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class MinimalTreeFromArray {
    // Time: O(n)
    // Space: O(n)
    public static TreeNode createMinimalBst(int[] array) {
        return createMinimalBst(array, 0, array.length - 1);
    }

    private static TreeNode createMinimalBst(int[] array, int start, int end) {
        if (end < start) return null;
        System.out.println("start: " + start);
        System.out.println("end: " + end);
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(array[middle]);
        System.out.println(node.data);
        node.left = createMinimalBst(array, start, middle - 1);
        node.right = createMinimalBst(array, middle + 1, end);
        return node;
    }
}
