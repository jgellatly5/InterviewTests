package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.Arrays;
import java.util.Stack;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class InOrderTraversal {
    // Time: O(n)
    // Space: O(n)
    public static void inOrderTraversalRecursive(TreeNode node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRecursive(node.right);
        }
    }

    // Time: O(n)
    // Space: O(n)
    public static void inOrderTraversalIterative(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
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
