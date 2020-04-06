package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListBreadthFirst {
    public static ArrayList<LinkedList<BinarySearchTree.TreeNode>> createListsBfs(BinarySearchTree.TreeNode root) {
        ArrayList<LinkedList<BinarySearchTree.TreeNode>> allLists = new ArrayList<>();
        LinkedList<BinarySearchTree.TreeNode> currentList = new LinkedList<>();
        if (root != null) currentList.add(root);
        while (currentList.size() > 0) {
            allLists.add(currentList);
            LinkedList<BinarySearchTree.TreeNode> parents = currentList;
            currentList = new LinkedList<>();
            for (BinarySearchTree.TreeNode parent : parents) {
                if (parent.left != null) currentList.add(parent.left);
                if (parent.right != null) currentList.add(parent.right);
            }
        }
        return allLists;
    }
}
