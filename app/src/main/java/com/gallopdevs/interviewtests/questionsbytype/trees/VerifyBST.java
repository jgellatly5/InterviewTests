package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class VerifyBST {
    // Time: O(n)
    public static boolean verifyBST(BinarySearchTree.TreeNode node) {
        return verifyBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean verifyBST(BinarySearchTree.TreeNode node, int min, int max) {
        if (node == null) return true;
        if (node.data < min || node.data > max) return false;
        return verifyBST(node.left, min, node.data) && verifyBST(node.right, node.data + 1, max);
    }
}
