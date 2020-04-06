package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class ValidateBstInOrderTraversal {
    private static Integer lastPrinted = null;
    public static boolean validateBstIot(BinarySearchTree.TreeNode root) {
        if (root == null) return true;
        if (!validateBstIot(root.left)) return false;
        if (lastPrinted != null && root.data <= lastPrinted) return false;
        lastPrinted = root.data;
        if (!validateBstIot(root.right)) return false;
        return true;
    }
}
