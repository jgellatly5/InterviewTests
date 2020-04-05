package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class AreIdentical {
    // Recursive
    // Time: O(n)
    public static boolean areIdentical(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        return (a != null && b != null) && (a.data == b.data) &&
                areIdentical(a.left, b.left) && areIdentical(a.right, b.right);
    }
}
