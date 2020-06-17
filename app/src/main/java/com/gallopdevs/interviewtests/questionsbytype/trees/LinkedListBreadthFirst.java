package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.*;

public class LinkedListBreadthFirst {
    public static ArrayList<LinkedList<TreeNode>> createListsBfs(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> allLists = new ArrayList<>();
        LinkedList<TreeNode> currentList = new LinkedList<>();
        if (root != null) currentList.add(root);
        while (currentList.size() > 0) {
            allLists.add(currentList);
            LinkedList<TreeNode> parents = currentList;
            currentList = new LinkedList<>();
            for (TreeNode parent : parents) {
                if (parent.left != null) currentList.add(parent.left);
                if (parent.right != null) currentList.add(parent.right);
            }
        }
        return allLists;
    }
}
