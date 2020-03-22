package com.gallopdevs.interviewtests.questionsbytype.trees;

public class LongestConsecutiveBranch {

    public static class Node {
        public int data;
        public Node left;
        public Node right;
    }

    public static int consecutive(Node node) {
        if (node == null) return 0;
        return max(consecutive(node.left, node.data, 1), consecutive(node.right, node.data, 1));
    }

    private static int consecutive(Node node, int previous, int length) {
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
