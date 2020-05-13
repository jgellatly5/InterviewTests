package com.gallopdevs.interviewtests.questionsbytype;

import org.junit.Test;

import java.util.Stack;

public class ImplementationPractice {

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;
        public TreeNode parent;
        public TreeNode(int data) {
            this.data = data;
        }

        private TreeNode findMin() {
            if (left == null) return this;
            return left.findMin();
        }
    }

    @Test
    public void Practice() {

    }

    private void createMinimalTree(int[] numbers) {
        createMinimalTree(numbers, 0, numbers.length - 1);
    }

    private TreeNode createMinimalTree(int[] numbers, int start, int end) {
        if (end < start) return null;
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(numbers[middle]);
        node.left = createMinimalTree(numbers, start, middle - 1);
        node.right = createMinimalTree(numbers, middle + 1, end);
        return node;
    }

}
