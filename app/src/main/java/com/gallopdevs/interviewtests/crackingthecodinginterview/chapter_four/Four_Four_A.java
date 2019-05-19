package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_four;

public class  Four_Four_A {
    public static class TreeNode {
        public int data;
        public TreeNode left, right, parent;
        private int size = 0;

        public TreeNode(int data) {
            this.data = data;
            size = 1;
        }
    }

    private static int getHeight(TreeNode root) {
        if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}
