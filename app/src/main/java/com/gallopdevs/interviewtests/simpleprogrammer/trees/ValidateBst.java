package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class ValidateBst {
    // solution 1: in-order traversal
    private static Integer lastPrinted = null;
    public static boolean checkBst(TreeNode root) {
        if (root == null) return true;
        if (!checkBst(root.left)) return false;
        if (lastPrinted != null && root.data <= lastPrinted) return false;
        lastPrinted = root.data;
        if (!checkBst(root.right)) return false;
        return true;
    }

    // solution 2: min / max solution
    public static boolean checkBstMax(TreeNode root) {
        return checkBst(root, null, null);
    }

    private static boolean checkBst(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.data <= min) || (max != null && root.data > max)) return false;
        if (!checkBst(root.left, min, root.data) || !checkBst(root.right, root.data, max)) return false;
        return true;
    }
}
