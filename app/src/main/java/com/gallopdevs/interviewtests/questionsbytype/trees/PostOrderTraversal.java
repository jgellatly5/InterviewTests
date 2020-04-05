package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

import java.util.Stack;

public class PostOrderTraversal {
    // Time: O(n)
    // Space: O(n)
    public static void postOrderTraversalRecursive(TreeNode node) {
        if (node != null) {
            postOrderTraversalRecursive(node.left);
            postOrderTraversalRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Time: O(n)
    // Space: O(n)
    public static void postOrderTraversalIterative(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> out = new Stack<>();
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            out.push(current.data);
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        while (!out.isEmpty()) {
            System.out.print(out.pop() + " ");
        }
    }
}
