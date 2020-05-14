package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import java.util.Stack;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class PreOrderTraversal {
    // Time: O(n)
    // Space: O(n)
    public static void preOrderTraversalRecursive(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversalRecursive(node.left);
            preOrderTraversalRecursive(node.right);
        }
    }

    // Time: O(n)
    // Space: O(n)
    public static void preOrderTraversalIterative(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode current = root;
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
