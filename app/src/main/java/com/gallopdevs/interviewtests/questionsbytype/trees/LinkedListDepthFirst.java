package com.gallopdevs.interviewtests.questionsbytype.trees;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.TreeNode;

public class LinkedListDepthFirst {
    public static ArrayList<LinkedList<TreeNode>> createListsDfs(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> allLists = new ArrayList<>();
        createListsDfs(root, allLists, 0);
        return allLists;
    }

    private static void createListsDfs(TreeNode node,
                                       ArrayList<LinkedList<TreeNode>> allLists,
                                       int level) {
        if (node == null) return;
        LinkedList<TreeNode> currentList;
        if (allLists.size() == level) {
            currentList = new LinkedList<>();
            allLists.add(currentList);
        } else {
            currentList = allLists.get(level);
        }
        currentList.add(node);
        createListsDfs(node.left, allLists, level + 1);
        createListsDfs(node.right, allLists, level + 1);
    }
}
