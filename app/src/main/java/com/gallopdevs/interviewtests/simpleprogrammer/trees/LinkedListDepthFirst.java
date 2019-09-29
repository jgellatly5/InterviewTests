package com.gallopdevs.interviewtests.simpleprogrammer.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDepthFirst {
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedListDepthFirst(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> allLists = new ArrayList<>();
        createLevelLinkedListDepthFirst(root, allLists, 0);
        return allLists;
    }

    private static void createLevelLinkedListDepthFirst(TreeNode root,
                                                        ArrayList<LinkedList<TreeNode>> allLists,
                                                        int level) {
        if (root == null) return;
        LinkedList<TreeNode> currentList;
        if (allLists.size() == level) {
            currentList = new LinkedList<>();
            allLists.add(currentList);
        } else {
            currentList = allLists.get(level);
        }
        currentList.add(root);
        createLevelLinkedListDepthFirst(root.left, allLists, level + 1);
        createLevelLinkedListDepthFirst(root.right, allLists, level + 1);
    }
}
