package com.gallopdevs.interviewtests.questionsbytype.trees.operations;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindHeight {
    // Recursive
    // Time: O (log(n))
    public static int findHeight(BinarySearchTree.TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }
    // Iterative
    // Time: O(n)
    // Space: O(n)
    public static int findHeightIterative(BinarySearchTree.TreeNode root) {
        if (root == null) return 0;
        Queue<BinarySearchTree.TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        BinarySearchTree.TreeNode front;
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
