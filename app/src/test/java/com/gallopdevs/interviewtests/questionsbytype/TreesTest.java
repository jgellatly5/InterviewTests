package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.TreeNode;
import com.gallopdevs.interviewtests.questionsbytype.trees.AreIdentical;
import com.gallopdevs.interviewtests.questionsbytype.trees.FindHeight;
import com.gallopdevs.interviewtests.questionsbytype.trees.InOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.IsBalanced;
import com.gallopdevs.interviewtests.questionsbytype.trees.LevelOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListBreadthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListDepthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LongestConsecutiveBranch;
import com.gallopdevs.interviewtests.questionsbytype.trees.MinimalTreeFromArray;
import com.gallopdevs.interviewtests.questionsbytype.trees.PostOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.PreOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.ValidateBstInOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.ValidateBstMinMax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreesTest {

    private TreeNode root;
    private TreeNode longestNode;
    private TreeNode node;
    private TreeNode node2;
    private TreeNode isBalancedNode;

    @Before
    public void setup() {
        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(10);
        root.left.left.left = new TreeNode(13);
        root.left.left.right = new TreeNode(15);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(19);
        root.right.right.right = new TreeNode(17);
        root.right.right.left = new TreeNode(21);

        longestNode = new TreeNode(0);
        longestNode.left = new TreeNode(1);
        longestNode.right = new TreeNode(2);
        longestNode.left.left = new TreeNode(1);
        longestNode.left.right = new TreeNode(2);
        longestNode.right.left = new TreeNode(1);
        longestNode.right.right = new TreeNode(3);

        node = new TreeNode(5);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);

        node2 = new TreeNode(5);
        node2.left = new TreeNode(2);
        node2.right = new TreeNode(7);
        node2.left.left = new TreeNode(1);
        node2.left.right = new TreeNode(3);
        node2.right.left = new TreeNode(6);
        node2.right.right = new TreeNode(8);

        isBalancedNode = new TreeNode(1);
        isBalancedNode.left = new TreeNode(2);
        isBalancedNode.right = new TreeNode(3);
        isBalancedNode.left.left = new TreeNode(4);
        isBalancedNode.right.left = new TreeNode(6);
        isBalancedNode.right.right = new TreeNode(7);
    }


    @Test
    public void MinimalTreeFromArray() {
        System.out.println("=========Test1 MinimalTreeFromArray=========");
        int[] minimalTreeArray = new int[]{2, 4, 6, 8, 12, 24, 35, 46};
        TreeNode minimalTree = MinimalTreeFromArray.createMinimalBst(minimalTreeArray);
        System.out.println("Height of the tree is: " + FindHeight.findHeight(minimalTree));
        LevelOrderTraversal.levelOrderTraversal(minimalTree);
    }

    @Test
    public void LinkedListDepthFirst() {
        System.out.println("=========Test1 LinkedListDepthFirst=========");
        ArrayList<LinkedList<TreeNode>> lists = LinkedListDepthFirst.createListsDfs(root);
        for (LinkedList<TreeNode> list : lists) {
            for (TreeNode node : list) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void LinkedListBreadthFirst() {
        System.out.println("=========Test1 LinkedListBreadthFirst=========");
        ArrayList<LinkedList<TreeNode>> lists = LinkedListBreadthFirst.createListsBfs(root);
        for (LinkedList<TreeNode> list : lists) {
            for (TreeNode node : list) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void ValidateBstInOrderTraversal() {
        System.out.println("=========Test1 ValidateBstInOrderTraversal=========");
        System.out.println(ValidateBstInOrderTraversal.validateBstIot(root));
    }

    @Test
    public void ValidateBstMinMax() {
        System.out.println("=========Test1 ValidateBstMinMax=========");
        System.out.println(ValidateBstMinMax.validateBstMinMax(root));
    }

    @Test
    public void FindHeight() {
        System.out.println("=========FindHeight=========");
        System.out.println(FindHeight.findHeight(node));
        System.out.println(FindHeight.findHeightIterative(node));
        System.out.println(FindHeight.findHeight(root));
        System.out.println(FindHeight.findHeightIterative(root));
    }

    @Test
    public void IsBalanced() {
        System.out.println("=========IsBalanced=========");
        System.out.println(IsBalanced.isBalanced(isBalancedNode));
    }

    @Test
    public void LongestConsecutiveBranch() {
        System.out.println("=========LongestConsecutiveBranch=========");
        System.out.println(LongestConsecutiveBranch.consecutive(longestNode));
    }

    @Test
    public void AreIdentical() {
        System.out.println("=========AreIdentical=========");
        System.out.println(AreIdentical.areIdentical(node, node2));
    }

    @Test
    public void InOrderTraversal() {
        System.out.println("=========InOrderTraversal=========");
        InOrderTraversal.inOrderTraversalRecursive(root);
        System.out.println();
        InOrderTraversal.inOrderTraversalIterative(root);
    }

    @Test
    public void PreOrderTraversal() {
        System.out.println("=========PreOrderTraversal=========");
        PreOrderTraversal.preOrderTraversalRecursive(root);
        System.out.println();
        PreOrderTraversal.preOrderTraversalIterative(root);
    }

    @Test
    public void PostOrderTraversal() {
        System.out.println("=========PostOrderTraversal=========");
        PostOrderTraversal.postOrderTraversalRecursive(root);
        System.out.println();
        PostOrderTraversal.postOrderTraversalIterative(root);
    }

    @Test
    public void LevelOrderTraversal() {
        System.out.println("=========LevelOrderTraversal=========");
        LevelOrderTraversal.levelOrderTraversal(root);
        System.out.println();
        LevelOrderTraversal.levelOrderTraversalQueue(root);
    }

    @Test
    public void Practice() {

    }
}
