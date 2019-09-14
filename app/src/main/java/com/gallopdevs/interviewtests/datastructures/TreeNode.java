package com.gallopdevs.interviewtests.datastructures;

public class TreeNode {
    public int data;
    public TreeNode left, right, parent;
    public int size;
    public TreeNode(int data) {
        this.data = data;
        size = 1;
    }
}
