package com.gallopdevs.interviewtests.questionsbytype.trees;

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

    private static boolean printGivenLevel(BinarySearchTree.TreeNode root, int level) {
        if (root == null) return false;
        if (level == 1) {
            System.out.print(root.data + " ");
            return true;
        }
        boolean left = printGivenLevel(root.left, level - 1);
        boolean right = printGivenLevel(root.right, level - 1);
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
