package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_four;

public class Four_Five {

    public static class TreeNode {
        public int data;
        public TreeNode left, right, parent;
        private int size = 0;

        public TreeNode(int data) {
            this.data = data;
            size = 1;
        }
    }

    private static Integer lastPrinted = null;
    public static boolean checkBST(Four_Five_A.TreeNode node) {
        if (node == null) return true;
        if (!checkBST(node.left)) return false;
        if (lastPrinted != null && node.data <= lastPrinted) return false;
        lastPrinted = node.data;
        if (!checkBST(node.right)) return false;
        return true;
    }
}
