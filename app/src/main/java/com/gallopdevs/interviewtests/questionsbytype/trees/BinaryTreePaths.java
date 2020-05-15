package com.gallopdevs.interviewtests.questionsbytype.trees;

import java.util.ArrayDeque;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class BinaryTreePaths {
    // Time: O(n)
    // Space: O(h), h = height of tree
    public static void binaryTreePaths(TreeNode root) {
        ArrayDeque<Integer> paths = new ArrayDeque<>();
        printPaths(root, paths);
    }

    private static void printPaths(TreeNode node, ArrayDeque<Integer> path) {
        // base case
        if (node == null) return;

        // include current node to the path
        path.addLast(node.data);

        // if leaf node is found, print the path
        if (node.left == null && node.right == null) {
            System.out.println(path);
        }

        // recurse down left and right subtree
        printPaths(node.left, path);
        printPaths(node.right, path);

        // remove current node after left and right subtree are done
        path.removeLast();
    }
}
