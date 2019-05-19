package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_four;

public class Four_Two_A {

    public static class TreeNode {
        public int data;
        public TreeNode left, right, parent;
        private int size;
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
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(array[middle]);
        node.left = createMinimalBST(array, start, middle - 1);
        node.right = createMinimalBST(array, middle + 1, end);
        return node;
    }
}
