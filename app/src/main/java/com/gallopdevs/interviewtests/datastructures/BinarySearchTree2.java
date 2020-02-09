package com.gallopdevs.interviewtests.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree2 {

    private static class Node {
        private int key;
        private String value;
        private Node left;
        private Node right;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        Node findMin() {
            if (left == null) return this;
            else return left.findMin();
        }
    }

    private Node root;

    public BinarySearchTree2() {
        root = null;
    }

    // findKey
    public String findKey(int key) {
        Node node = findNode(root, key);
        return node == null ? null : node.value;
    }

    // findNode (private)
    private Node findNode(Node node, int key) {
        if (node == null) return null;
        else if (key == node.key) return node;
        else if (key < node.key) return findNode(node.left, key);
        else return findNode(node.right, key);
    }

    // insert
    public void insert(int key, String value) {
        root = insertItem(root, key, value);
    }

    // insertItem (private)
    private Node insertItem(Node node, int key, String value) {
        if (node == null) return new Node(key, value);
        if (key < node.key) node.left = insertItem(node.left, key, value);
        else node.right = insertItem(node.right, key, value);
        return node;
    }

    // delete
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    // deleteNode (private)
    private Node deleteNode(Node node, int key) {
        if (node == null) return null;
        else if (key < node.key) node.left = deleteNode(node.left, key);
        else if (key > node.key) node.right = deleteNode(node.right, key);
        else {
            // case 1: no child
            if (node.left == null && node.right == null) node = null;
            // case 2: one child
            else if (node.left == null) node = node.right;
            else if (node.right == null) node = node.left;
            // case 3: both children
            else {
                Node minRight = findMinNode(node.right);
                node.key = minRight.key;
                node.value = minRight.value;
                node.right = deleteNode(node.right, node.key);
            }
        }
        return node;
    }

    // findMinNode (private)
    private Node findMinNode(Node node) {
        return node.findMin();
    }

    // printPreOrderTraversal
    public void printPreOrderTraversal() {
        preOrderTraversal(root);
    }

    // preOrderTraversal (private)
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // printInOrderTraversal
    public void printInOrderTraversal() {
        inOrderTraversal(root);
    }

    // inOrderTraversal (private)
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.key);
            inOrderTraversal(node.right);
        }
    }

    // printPostOrderTraversal
    public void printPostOrderTraversal() {
        postOrderTraversal(root);
    }

    // postOrderTraversal (private)
    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.key);
        }
    }

    // printLevelOrderTraversal (BFS)
    public void printLevelOrderTraversal(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(currentNode.key);
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
    }
}
