package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.Stack;

public class InOrderTraversal {
    // Time: O(n)
    // Space: O(n)
    public static void inOrderTraversalRecursive(BinarySearchTree.TreeNode node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRecursive(node.right);
        }
    }

    // Time: O(n)
    // Space: O(n)
    public static void inOrderTraversalIterative(BinarySearchTree.TreeNode root) {
        Stack<BinarySearchTree.TreeNode> stack = new Stack<>();
        BinarySearchTree.TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
    }
}
