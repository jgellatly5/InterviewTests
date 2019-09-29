package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class InOrderSuccesor {
    public static TreeNode inOrderSuccesor(TreeNode node) {
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
