package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class TreeToList {
    // <- 1 <-> 2 <-> 3 ->   <- 4 <-> 5 <-> 6 ->
    private TreeNode concatenate(TreeNode a, TreeNode b) {
        if (a == null) return b;
        if (b == null) return a;

        TreeNode aEnd = a.left; // (3)
        TreeNode bEnd = b.left; // (6)

        a.left = bEnd;  // connect 1 to 6
        bEnd.right = a; // connect 6 to 1
        aEnd.right = b; // connect 3 to 4
        b.left = aEnd;  // connect 4 to 3
        return a;
    }

    public TreeNode treeToList(TreeNode n) {
        if (n == null) return null;
        TreeNode leftList = treeToList(n.left);
        TreeNode rightList = treeToList(n.right);
        n.left = n;
        n.right = n;
        n = concatenate(leftList, n);
        n = concatenate(n, rightList);
        return n;
    }
}
