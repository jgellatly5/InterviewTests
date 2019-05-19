package com.gallopdevs.interviewtests.simpleprogrammer.trees;

public class CheckSubtree {
    public static class TreeNode {
        public int data;
        public TreeNode left, right, parent;
        private int size = 0;

        public TreeNode(int data) {
            this.data = data;
            size = 1;
        }
    }

    public static boolean containsTree(TreeNode t1, TreeNode t2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        getOrderString(t1, string1);
        getOrderString(t2, string2);
        return string1.indexOf(string2.toString()) != -1;
    }

    private static void getOrderString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("X");
            return;
        }
        sb.append(node.data + " ");
        getOrderString(node.left, sb);
        getOrderString(node.right, sb);
    }
}
