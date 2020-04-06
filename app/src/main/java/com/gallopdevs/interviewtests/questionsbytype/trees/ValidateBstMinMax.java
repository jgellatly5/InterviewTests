package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class ValidateBstMinMax {
    public static boolean validateBstMinMax(BinarySearchTree.TreeNode root) {
        return validateBstMinMax(root, null, null);
    }

    private static boolean validateBstMinMax(BinarySearchTree.TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.data <= min) || (max != null && root.data > max)) return false;
        if (!validateBstMinMax(root.left, min, root.data) || !validateBstMinMax(root.right, root.data, max)) return false;
        return true;
    }
}
