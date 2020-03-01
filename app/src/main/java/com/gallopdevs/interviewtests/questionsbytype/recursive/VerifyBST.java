package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class VerifyBST {

    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean isBST(Node node) {
        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBST(Node node, int min, int max) {
        if (node == null) return true;
        if (node.data < min || node.data > max) return false;
        return isBST(node.left, min, node.data) && isBST(node.right, node.data + 1, max);
    }
}
