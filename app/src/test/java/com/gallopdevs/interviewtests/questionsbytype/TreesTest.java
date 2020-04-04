package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.TreeNode;
import com.gallopdevs.interviewtests.questionsbytype.trees.FindHeight;
import com.gallopdevs.interviewtests.questionsbytype.trees.IsBalanced;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListBreadthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListDepthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LongestConsecutiveBranch;
import com.gallopdevs.interviewtests.questionsbytype.trees.MinimalTreeFromArray;
import com.gallopdevs.interviewtests.questionsbytype.trees.ValidateBstInOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.ValidateBstMinMax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TreesTest {

    private TreeNode root;
    private TreeNode longestNode;
    private TreeNode node;
    private IsBalanced.Node isBalancedNode;

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

        isBalancedNode = new IsBalanced.Node(1);
        isBalancedNode.left = new IsBalanced.Node(2);
        isBalancedNode.right = new IsBalanced.Node(3);
        isBalancedNode.left.left = new IsBalanced.Node(4);
        isBalancedNode.right.left = new IsBalanced.Node(6);
        isBalancedNode.right.right = new IsBalanced.Node(7);
    }


    @Test
    public void MinimalTreeFromArray() {
        System.out.println("=========Test1 MinimalTreeFromArray=========");
        int[] minimalTreeArray = new int[]{2, 4, 6, 8, 12, 24, 35, 46};
        TreeNode minimalTree = MinimalTreeFromArray.createMinimalBst(minimalTreeArray);
        System.out.println("Height of the tree is: " + FindHeight.findHeight(minimalTree));
        printTreeByLevel(minimalTree);
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
    }

    @Test
    public void IsBalanced() {
        System.out.println("=========IsBalanced=========");
        System.out.println(IsBalanced.isBalanced(isBalancedNode));
    }

    @Test
    public void LongestConsecutiveBranch() {
        System.out.println("=========LongestConsecutiveBranch=========");
//        System.out.println(LongestConsecutiveBranch.longestConsecutiveBranch(longestNode));
    }

    @Test
    public void Practice() {
        int[] test1 = {8, 20, 5, 44, 12, 909};
        System.out.println(Arrays.toString(test1));
        System.out.println();
        printTreeByLevel(createMinimalBst(test1));
    }

    private TreeNode createMinimalBst(int[] array) {
        return createMinimalBst(array, 0, array.length - 1);
    }

    private TreeNode createMinimalBst(int[] array, int start, int end) {
        if (end < start) return null;
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(array[middle]);
        node.left = createMinimalBst(array, start, middle - 1);
        node.right = createMinimalBst(array, middle + 1, end);
        return node;
    }

    private static void printTreeByLevel(TreeNode root) {
        int height = FindHeight.findHeight(root);
        for (int i = 1; i <= height; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    private static void printGivenLevel(TreeNode root, int level) {
        if (root == null) return;
        if (level == 1) System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
}
