package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_four;

public class Four_Two {

    public static class TreeNode {
        public int data;
        public TreeNode left, right, parent;
        private int size = 0;

        public TreeNode(int data) {
            this.data = data;
            size = 1;
        }
    }

    public static TreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    private static TreeNode createMinimalBST(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(array[mid]);
        n.left = createMinimalBST(array, start, mid - 1);
        n.right = createMinimalBST(array, mid + 1, end);
        return n;
    }
}
