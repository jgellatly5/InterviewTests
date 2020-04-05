package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class LongestConsecutiveBranch {
    public static int consecutive(TreeNode node) {
        if (node == null) return 0;
        return max(consecutive(node.left, node.data, 1), consecutive(node.right, node.data, 1));
    }

    private static int consecutive(TreeNode node, int previous, int length) {
        if (node == null) return length;
        if (node.data == previous + 1) {
            int leftLength = consecutive(node.left, node.data, length + 1);
            int rightLength = consecutive(node.right, node.data, length + 1);
            return max(leftLength, rightLength);
        } else {
            int leftLength = consecutive(node.left, node.data, 1);
            int rightLength = consecutive(node.right, node.data, 1);
            return max(leftLength, rightLength, length);
        }
    }

    private static int max(int... vals) {
        int max = Integer.MIN_VALUE;
        for (int x : vals) {
            if (x > max) max = x;
        }
        return max;
    }
}
