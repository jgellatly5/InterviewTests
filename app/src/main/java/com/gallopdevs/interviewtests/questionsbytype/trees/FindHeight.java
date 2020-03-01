package com.gallopdevs.interviewtests.questionsbytype.trees;

public class FindHeight {
    public static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public static int findHeight(Node node) {
        if (node == null) return 0;
        else {
            int leftHeight = findHeight(node.left);
            int rightHeight = findHeight(node.right);
            if (leftHeight > rightHeight) return leftHeight + 1;
            else return rightHeight + 1;
        }
    }
}
