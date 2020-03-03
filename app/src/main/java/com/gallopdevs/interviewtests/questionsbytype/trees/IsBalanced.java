package com.gallopdevs.interviewtests.questionsbytype.trees;

public class IsBalanced {
    public static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean isBalanced(Node node) {
        return balancedHeight(node) > -1;
    }

    private static int balancedHeight(Node node) {
        if (node == null) return 0;
        int h1 = balancedHeight(node.left);
        int h2 = balancedHeight(node.right);
        if (h1 == -1 || h2 == -1) return -1;
        if (Math.abs(h1 - h2) > 1) return -1;
        if (h1 > h2) return h1 + 1;
        return h2 + 1;
    }
}
