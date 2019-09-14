package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDepths2 {
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedListDepthFirst(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        createLevelLinkedListDepthFirst(root, lists, 0);
        return lists;
    }
    // DFS
    private static void createLevelLinkedListDepthFirst(TreeNode root,
                                                        ArrayList<LinkedList<TreeNode>> lists,
                                                        int level) {
        if (root == null) return;
        LinkedList<TreeNode> list;
        if (lists.size() == level) {
            list = new LinkedList<>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedListDepthFirst(root.left, lists, level + 1);
        createLevelLinkedListDepthFirst(root.right, lists, level + 1);
    }
    // BFS
    private static ArrayList<LinkedList<TreeNode>> createLevelLinkedListBreadthFirst(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        if (root != null) {
            current.add(root);
        }
        while (current.size() > 0) {
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<TreeNode>();
            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }
        return result;
    }
}
