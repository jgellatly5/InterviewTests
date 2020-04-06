package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class IsBalanced {
    public static boolean isBalanced(BinarySearchTree.TreeNode node) {
        return balancedHeight(node) > -1;
    }

    private static int balancedHeight(BinarySearchTree.TreeNode node) {
        if (node == null) return 0;
        int h1 = balancedHeight(node.left);
        int h2 = balancedHeight(node.right);
        if (h1 == -1 || h2 == -1) return -1;
        if (Math.abs(h1 - h2) > 1) return -1;
        if (h1 > h2) return h1 + 1;
        return h2 + 1;
    }
}
