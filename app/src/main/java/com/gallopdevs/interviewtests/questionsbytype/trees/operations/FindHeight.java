package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class FindHeight {
    // Recursive
    // Time: O (log(n))
    public static int findHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }

    // Iterative
    // Time: O(n)
    // Space: O(n)
    public static int findHeightIterative(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        TreeNode front;
        int height = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                front = queue.poll();
                if (front.left != null) queue.add(front.left);
                if (front.right != null) queue.add(front.right);
            }
            height++;
        }
        return height;
    }
}
