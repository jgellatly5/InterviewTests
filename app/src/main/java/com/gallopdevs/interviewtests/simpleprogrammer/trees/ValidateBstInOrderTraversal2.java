package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class ValidateBstInOrderTraversal2 {
    private static Integer lastPrinted = null;
    public static boolean validateBstIot(TreeNode root) {
        if (root == null) return true;
        if (!validateBstIot(root.left)) return false;
        if (lastPrinted != null && root.data <= lastPrinted) return false;
        lastPrinted = root.data;
        if (!validateBstIot(root.right)) return false;
        return true;
    }
}
