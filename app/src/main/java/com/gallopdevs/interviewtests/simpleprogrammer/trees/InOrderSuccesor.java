package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_four.Four_Six;

public class InOrderSuccesor {
    public static class TreeNode {
        public int data;
        public TreeNode left, right, parent;
        private int size = 0;

        public TreeNode(int data) {
            this.data = data;
            size = 1;
        }
    }

    public static TreeNode inOrderSuccesor(TreeNode node) {
        if (node == null) return null;
        if (node.right == null) return leftMostChild(node.right);
        else {
            TreeNode q = node;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    private static TreeNode leftMostChild(TreeNode node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
