package com.gallopdevs.interviewtests.datastructures;

public class BinarySearchTree {

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

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public String findKey(int key) {
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

    public Node findMinNode(Node node) {
        return node.findMin();
    }

    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node node, int key) {
        if (node == null) {
            return null;
        } else if (key < node.key) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        } else {
            // case 1: no child
            if (node.left == null && node.right == null) {
                node = null;
            }

            // case 2: one child
            else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            }

            // case 3 : both children
            else {
                Node minRight = findMinNode(node.right);
                node.key = minRight.key;
                node.value = minRight.value;
                node.right = deleteNode(node.right, node.key);
            }
        }
        return node;
    }

    public void printInOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.key);
            inOrderTraversal(node.right);
        }
    }

    public void printPreOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void printPostOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.key);
        }
    }

}