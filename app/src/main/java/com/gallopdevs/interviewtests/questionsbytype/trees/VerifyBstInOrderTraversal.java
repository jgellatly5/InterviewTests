package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class VerifyBstInOrderTraversal {
    private static Integer lastPrinted = null;
    public static boolean verifyBstIot(BinarySearchTree.TreeNode root) {
        if (root == null) return true;
        if (!verifyBstIot(root.left)) return false;
        if (lastPrinted != null && root.data <= lastPrinted) return false;
        lastPrinted = root.data;
        if (!verifyBstIot(root.right)) return false;
        return true;
    }
}
