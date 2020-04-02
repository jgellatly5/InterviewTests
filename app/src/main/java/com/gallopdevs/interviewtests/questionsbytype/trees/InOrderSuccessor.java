package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class InOrderSuccessor {
    public static TreeNode inOrderSuccessor(TreeNode node) {
        if (node == null) return null;
        if (node.right == null) return leftMostChild(node.right);
        else {
            TreeNode q = node;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    private static TreeNode leftMostChild(TreeNode node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
