package com.gallopdevs.interviewtests.questionsbytype.trees;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class InOrderSuccessor {
    public static TreeNode inOrderSuccessor(TreeNode node) {
        if (node == null) return null;
        if (node.right != null) return leftMostChild(node.right);
        else {
            TreeNode current = node;
            TreeNode parent = current.parent;
            while (parent != null && parent.left != current) {
                current = parent;
                parent = parent.parent;
            }
            return parent;
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
