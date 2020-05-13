package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.BinarySearchTree;
import com.gallopdevs.interviewtests.questionsbytype.trees.AverageOfLevels;
import com.gallopdevs.interviewtests.questionsbytype.trees.operations.AreEqual;
import com.gallopdevs.interviewtests.questionsbytype.trees.operations.FindHeight;
import com.gallopdevs.interviewtests.questionsbytype.trees.operations.InOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.IsBalanced;
import com.gallopdevs.interviewtests.questionsbytype.trees.operations.LevelOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListBreadthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListDepthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LongestConsecutiveBranch;
import com.gallopdevs.interviewtests.questionsbytype.trees.MinimalTreeFromArray;
import com.gallopdevs.interviewtests.questionsbytype.trees.operations.PostOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.operations.PreOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.SpiralOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.VerifyBST;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreesTest {

    private BinarySearchTree.TreeNode root;
    private BinarySearchTree.TreeNode longestNode;
    private BinarySearchTree.TreeNode node;
    private BinarySearchTree.TreeNode node2;
    private BinarySearchTree.TreeNode isBalancedNode;

    @Before
    public void setup() {
        root = new BinarySearchTree.TreeNode(5);
        root.left = new BinarySearchTree.TreeNode(4);
        root.left.left = new BinarySearchTree.TreeNode(6);
        root.left.right = new BinarySearchTree.TreeNode(10);
        root.left.left.left = new BinarySearchTree.TreeNode(13);
        root.left.left.right = new BinarySearchTree.TreeNode(15);
        root.right = new BinarySearchTree.TreeNode(7);
        root.right.right = new BinarySearchTree.TreeNode(9);
        root.right.left = new BinarySearchTree.TreeNode(19);
        root.right.right.right = new BinarySearchTree.TreeNode(17);
        root.right.right.left = new BinarySearchTree.TreeNode(21);

        longestNode = new BinarySearchTree.TreeNode(0);
        longestNode.left = new BinarySearchTree.TreeNode(1);
        longestNode.right = new BinarySearchTree.TreeNode(2);
        longestNode.left.left = new BinarySearchTree.TreeNode(1);
        longestNode.left.right = new BinarySearchTree.TreeNode(2);
        longestNode.right.left = new BinarySearchTree.TreeNode(1);
        longestNode.right.right = new BinarySearchTree.TreeNode(3);

        node = new BinarySearchTree.TreeNode(5);
        node.left = new BinarySearchTree.TreeNode(2);
        node.right = new BinarySearchTree.TreeNode(7);
        node.left.left = new BinarySearchTree.TreeNode(1);
        node.left.right = new BinarySearchTree.TreeNode(3);
        node.right.left = new BinarySearchTree.TreeNode(6);
        node.right.right = new BinarySearchTree.TreeNode(8);

        node2 = new BinarySearchTree.TreeNode(5);
        node2.left = new BinarySearchTree.TreeNode(2);
        node2.right = new BinarySearchTree.TreeNode(7);
        node2.left.left = new BinarySearchTree.TreeNode(1);
        node2.left.right = new BinarySearchTree.TreeNode(3);
        node2.right.left = new BinarySearchTree.TreeNode(6);
        node2.right.right = new BinarySearchTree.TreeNode(8);

        isBalancedNode = new BinarySearchTree.TreeNode(1);
        isBalancedNode.left = new BinarySearchTree.TreeNode(2);
        isBalancedNode.right = new BinarySearchTree.TreeNode(3);
        isBalancedNode.left.left = new BinarySearchTree.TreeNode(4);
        isBalancedNode.left.right = new BinarySearchTree.TreeNode(5);
        isBalancedNode.right.left = new BinarySearchTree.TreeNode(6);
        isBalancedNode.right.right = new BinarySearchTree.TreeNode(7);
        isBalancedNode.right.left.left = new BinarySearchTree.TreeNode(8);
//        isBalancedNode.right.left.left.left = new BinarySearchTree.TreeNode(9);
    }


    @Test
    public void MinimalTreeFromArray() {
        System.out.println("=========Test1 MinimalTreeFromArray=========");
        int[] minimalTreeArray = new int[]{2, 4, 6, 8, 12, 24, 35, 46};
        BinarySearchTree.TreeNode minimalTree = MinimalTreeFromArray.createMinimalBst(minimalTreeArray);
        System.out.println("Height of the tree is: " + FindHeight.findHeight(minimalTree));
        PreOrderTraversal.preOrderTraversalRecursive(minimalTree);
        System.out.println("\n=========Test2 MinimalTreeFromArray=========");
        int[] minimalTreeArray2 = new int[]{1, 2, 3, 4, 5};
        BinarySearchTree.TreeNode minimalTree2 = MinimalTreeFromArray.createMinimalBst(minimalTreeArray2);
        System.out.println("Height of the tree is: " + FindHeight.findHeight(minimalTree2));
        PreOrderTraversal.preOrderTraversalRecursive(minimalTree2);
        System.out.println("\n=========Test3 MinimalTreeFromArray=========");
        int[] minimalTreeArray3 = new int[]{1, 2, 3, 5, 7, 8, 9};
        BinarySearchTree.TreeNode minimalTree3 = MinimalTreeFromArray.createMinimalBst(minimalTreeArray3);
        System.out.println("Height of the tree is: " + FindHeight.findHeight(minimalTree3));
        PreOrderTraversal.preOrderTraversalRecursive(minimalTree3);
    }

    @Test
    public void LinkedListDepthFirst() {
        System.out.println("=========Test1 LinkedListDepthFirst=========");
        ArrayList<LinkedList<BinarySearchTree.TreeNode>> lists = LinkedListDepthFirst.createListsDfs(root);
        for (LinkedList<BinarySearchTree.TreeNode> list : lists) {
            for (BinarySearchTree.TreeNode node : list) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void LinkedListBreadthFirst() {
        System.out.println("=========Test1 LinkedListBreadthFirst=========");
        ArrayList<LinkedList<BinarySearchTree.TreeNode>> lists = LinkedListBreadthFirst.createListsBfs(root);
        for (LinkedList<BinarySearchTree.TreeNode> list : lists) {
            for (BinarySearchTree.TreeNode node : list) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void VerifyBST() {
        System.out.println("=========VerifyBST=========");
        System.out.println(VerifyBST.verifyBST(root));
        System.out.println(VerifyBST.verifyBST(node));
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
        System.out.println(AreEqual.areEqual(node, node2));
        System.out.println(AreEqual.areEqual(node2, isBalancedNode));
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
    public void SpiralOrderTraversal() {
        System.out.println("=========SpiralOrderTraversal=========");
        LevelOrderTraversal.levelOrderTraversal(root);
        System.out.println();
        SpiralOrderTraversal.spiralOrderTraversal(root);
        System.out.println();
        SpiralOrderTraversal.spiralOrderTraversalQueue(root);
    }

    @Test
    public void AverageOfLevels() {
        System.out.println("=========AverageOfLevels=========");
        LevelOrderTraversal.levelOrderTraversal(root);
        System.out.println(AverageOfLevels.averageOfLevelsDfs(root));
    }

    @Test
    public void Practice() {
        System.out.println("=========VerifyBST=========");
        System.out.println(verifyBst(root));
        System.out.println(verifyBst(node));
    }

    public boolean verifyBst(BinarySearchTree.TreeNode node) {
        return verifyBst(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean verifyBst(BinarySearchTree.TreeNode node, int min, int max) {
        if (node == null) return true;
        if (node.data < min || node.data > max) return false;
        return verifyBst(node.left, min, node.data) && verifyBst(node.right, node.data + 1, max);
    }
}
