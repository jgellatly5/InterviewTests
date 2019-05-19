package com.gallopdevs.interviewtests.datastructures;

public class BinarySearchTree2 {

    private static class Node {
        private int key;
        private String value;
        private Node left;
        private Node right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public Node findMin() {
            if (left == null) {
                return this;
            } else {
                return left.findMin();
            }
        }
    }

    public Node root;

    public BinarySearchTree2() {
        root = null;
    }

    public String find(int key) {
        Node node = findNode(root, key);
        return node == null ? null : node.value;
    }

    private Node findNode(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        } else if (key < node.key) {
            return findNode(node.left, key);
        } else if (key > node.key) {
            return findNode(node.right, key);
        }
        return null;
    }

    public void insert(int key, String value) {
        root = insertItem(root, key, value);
    }

    private Node insertItem(Node node, int key, String value) {
        Node newNode = new Node(key, value);
        if (node == null) {
            node = newNode;
            return node;
        }

        if (key < node.key) {
            node.left = insertItem(node.left, key, value);
        } else {
            node.right = insertItem(node.right, key, value);
        }
        return node;
    }

    public void delete(int key) {
        root = deleteNode(root, key);
    }

    public Node findMinNode(Node node) {
        return node.findMin();
    }

    private Node deleteNode(Node node, int key) {
        if (node == null) {
            return null;
        } else if (key < node.key) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        } else {
            // case 1: no children
            if (node.left == null && node.right == null) {
                node = null;
            }

            // case 2: one child
            else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            }

            // case 3: both children
            else {
                Node minNodeRight = findMinNode(node.right);
                node.key = minNodeRight.key;
                node.value = minNodeRight.value;
                node.right = deleteNode(node.right, node.key);
            }
        }
        return node;
    }

}
