package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class AreEqual {
    // Recursive
    // Time: O(n)
    public static boolean areEqual(BinarySearchTree.TreeNode a, BinarySearchTree.TreeNode b) {
        if (a == null && b == null) return true;
        return (a != null && b != null) && (a.data == b.data) &&
                areEqual(a.left, b.left) && areEqual(a.right, b.right);
    }
}
