package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class InOrderSuccessor {
    public static BinarySearchTree.TreeNode inOrderSuccessor(BinarySearchTree.TreeNode node) {
        if (node == null) return null;
        if (node.right == null) return leftMostChild(node.right);
        else {
            BinarySearchTree.TreeNode q = node;
            BinarySearchTree.TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    private static BinarySearchTree.TreeNode leftMostChild(BinarySearchTree.TreeNode node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
