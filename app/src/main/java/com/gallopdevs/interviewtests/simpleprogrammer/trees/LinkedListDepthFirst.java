package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDepthFirst {
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedListDepthFirst(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        createLevelLinkedListDepthFirst(root, lists, 0);
        return lists;
    }
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
}
