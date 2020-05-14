package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class LevelOrderTraversal {
    // Time: O(n^2)
    public static void levelOrderTraversal(TreeNode root) {
        int level = 1;
        while (printGivenLevel(root, level++)) {
            System.out.println();
        }
    }

    private static boolean printGivenLevel(TreeNode node, int level) {
        if (node == null) return false;
        if (level == 1) {
            System.out.print(node.data + " ");
            return true;
        }
        boolean left = printGivenLevel(node.left, level - 1);
        boolean right = printGivenLevel(node.right, level - 1);
        return left || right;
    }

    // Time: O(n)
    // Space: O(n)
    public static void levelOrderTraversalQueue(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        TreeNode current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}
