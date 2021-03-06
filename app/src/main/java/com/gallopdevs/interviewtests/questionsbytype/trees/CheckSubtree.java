package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

public class CheckSubtree {
    public static boolean containsTree(BinarySearchTree.TreeNode t1, BinarySearchTree.TreeNode t2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        getOrderString(t1, string1);
        getOrderString(t2, string2);
        return string1.indexOf(string2.toString()) != -1;
    }

    private static void getOrderString(BinarySearchTree.TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("X");
            return;
        }
        sb.append(node.data).append(" ");
        getOrderString(node.left, sb);
        getOrderString(node.right, sb);
    }
}
