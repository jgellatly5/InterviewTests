package com.gallopdevs.interviewtests.questionsbytype.trees;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class IsBalanced {

    //         1
    //     2       3
    //   4   5   6   7
    //          8
    //         9
    //
    // isBalanced(1)
    //  4

    public static boolean isBalanced(TreeNode root) {
        return balancedHeight(root) > -1;
    }

    private static int balancedHeight(TreeNode node) {
        if (node == null) return 0;
        int h1 = balancedHeight(node.left);
        int h2 = balancedHeight(node.right);
        if (h1 == -1 || h2 == -1) return -1;
        if (Math.abs(h1 - h2) > 1) return -1;
        if (h1 > h2) return h1 + 1;
        return h2 + 1;
    }
}
