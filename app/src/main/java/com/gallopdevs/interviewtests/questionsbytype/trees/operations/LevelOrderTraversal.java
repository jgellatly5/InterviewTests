package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
    // Time: O(n^2)
    public static void levelOrderTraversal(BinarySearchTree.TreeNode root) {
        int level = 1;
        while (printGivenLevel(root, level++)) {
            System.out.println();
        }
    }

    private static boolean printGivenLevel(BinarySearchTree.TreeNode node, int level) {
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
    public static void levelOrderTraversalQueue(BinarySearchTree.TreeNode root) {
        Queue<BinarySearchTree.TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        BinarySearchTree.TreeNode current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}
