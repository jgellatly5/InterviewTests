package com.gallopdevs.interviewtests.datastructures;

public class BinarySearchTree {
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
            else return left.findMin();
        }
    }

    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Time: O(n)
    public int findValue(int data) {
        TreeNode node = findNode(root, data);
        return node != null ? node.data : null;
    }

    private TreeNode findNode(TreeNode node, int key) {
        if (node == null || node.data == key) return node;
        if (key < node.data) return findNode(node.left, key);
        return findNode(node.right, key);
    }

    // Time: O(n)
    public void insertValue(int data) {
        root = insertNode(root, data);
    }

    private TreeNode insertNode(TreeNode node, int key) {
        TreeNode newNode = new TreeNode(key);
        if (node == null) {
            node = newNode;
            return node;
        }
        if (key < node.data) node.left = insertNode(node.left, key);
        else node.right = insertNode(node.right, key);
        return node;
    }

    private TreeNode findMinNode(TreeNode node) {
        return node.findMin();
    }

    // Time: O(n)
    public void deleteValue(int key) {
        root = deleteNode(root, key);
    }

    private TreeNode deleteNode(TreeNode node, int key) {
        if (node == null) return null;
        if (key < node.data) node.left = deleteNode(node.left, key);
        else if (key > node.data) node.right = deleteNode(node.right, key);
        else {
            if (node.left == null && node.right == null) node = null;
            else if (node.left == null) node = node.right;
            else if (node.right == null) node = node.left;
            else {
                TreeNode minRight = findMinNode(node.right);
                node.data = minRight.data;
                node.right = deleteNode(node.right, node.data);
            }
        }
        return node;
    }
}
