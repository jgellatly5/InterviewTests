package com.gallopdevs.interviewtests.simpleprogrammer;

import com.gallopdevs.interviewtests.datastructures.TreeNode;
import com.gallopdevs.interviewtests.simpleprogrammer.trees.MinimalTreeFromArray;

import org.junit.Test;

public class TreesTest {

    @Test
    public void MinimalTreeFromArray() {
        System.out.println("=========Test1 MinimalTreeFromArray=========");
        int[] minimalTreeArray = new int[]{2, 4, 6, 8, 12, 24, 35, 46};
        TreeNode minimalTree = MinimalTreeFromArray.createMinimalBst(minimalTreeArray);
        System.out.println("Height of the tree is: " + findTreeHeight(minimalTree));
        printTreeByLevel(minimalTree);
        System.out.println("\n=========Test2 MinimalTreeFromArray=========");
    }

    private static void printTreeByLevel(TreeNode root) {
        int height = findTreeHeight(root);
        for (int i = 1; i <= height; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    private static void printGivenLevel(TreeNode root, int level) {
        if (root == null) return;
        if (level == 1) System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    private static int findTreeHeight(TreeNode root) {
        if (root == null) return 0;
        else {
            int leftDepth = findTreeHeight(root.left);
            int rightDepth = findTreeHeight(root.right);
            if (leftDepth > rightDepth) return leftDepth + 1;
            else return rightDepth + 1;
        }
    }
}
