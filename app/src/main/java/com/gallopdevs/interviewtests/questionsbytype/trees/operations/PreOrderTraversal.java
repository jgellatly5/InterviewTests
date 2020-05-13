package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.Stack;

public class PreOrderTraversal {
    // Time: O(n)
    // Space: O(n)
    public static void preOrderTraversalRecursive(BinarySearchTree.TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversalRecursive(node.left);
            preOrderTraversalRecursive(node.right);
        }
    }

    // Time: O(n)
    // Space: O(n)
    public static void preOrderTraversalIterative(BinarySearchTree.TreeNode root) {
        if (root == null) return;
        Stack<BinarySearchTree.TreeNode> stack = new Stack<>();
        stack.push(root);
        BinarySearchTree.TreeNode current = root;
        while (!stack.isEmpty()) {
            if (current != null) {
                System.out.print(current.data + " ");
                if (current.right != null) {
                    stack.push(current.right);
                }
                current = current.left;
            } else {
                current = stack.pop();
            }
        }
    }
}
