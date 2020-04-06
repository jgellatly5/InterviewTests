package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Deque;

public class SpiralOrderTraversal {
    // Time: O(n^2)
    public static void spiralOrderTraversal(BinarySearchTree.TreeNode root) {
        if (root == null) return;
        int level = 1;
        while (printLevelLeftToRight(root, level++)
                && printLevelRightToLeft(root, level++));
    }

    private static boolean printLevelLeftToRight(BinarySearchTree.TreeNode root, int level) {
        if (root == null) return false;
        if (level == 1) {
            System.out.print(root.data + " ");
            return true;
        }
        boolean left = printLevelLeftToRight(root.left, level - 1);
        boolean right = printLevelLeftToRight(root.right, level - 1);
        return left || right;
    }

    private static boolean printLevelRightToLeft(BinarySearchTree.TreeNode root, int level) {
        if (root == null) return false;
        if (level == 1) {
            System.out.print(root.data + " ");
            return true;
        }
        boolean right = printLevelRightToLeft(root.right, level - 1);
        boolean left = printLevelRightToLeft(root.left, level - 1);
        return right || left;
    }

    // Time: O(n)
    // Space: O(n)
    public static void spiralOrderTraversalQueue(BinarySearchTree.TreeNode root) {
        if (root == null) return;
        Deque<BinarySearchTree.TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        boolean flag = false;
        while (!deque.isEmpty()) {
            int nodeCount = deque.size();
            if (flag) {
                while (nodeCount > 0) {
                    BinarySearchTree.TreeNode current = deque.pollFirst();
                    System.out.print(current.data + " ");
                    if (current.left != null) deque.addLast(current.left);
                    if (current.right != null) deque.addLast(current.right);
                    nodeCount--;
                }
            } else {
                while (nodeCount > 0) {
                    BinarySearchTree.TreeNode current = deque.pollLast();
                    System.out.print(current.data + " ");
                    if (current.right != null) deque.addFirst(current.right);
                    if (current.left != null) deque.addFirst(current.left);
                    nodeCount--;
                }
            }
            flag = !flag;
            System.out.println();
        }
    }
}
