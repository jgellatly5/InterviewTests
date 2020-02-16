package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.TreeNode;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListBreadthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.LinkedListDepthFirst;
import com.gallopdevs.interviewtests.questionsbytype.trees.MinimalTreeFromArray;
import com.gallopdevs.interviewtests.questionsbytype.trees.ValidateBstInOrderTraversal;
import com.gallopdevs.interviewtests.questionsbytype.trees.ValidateBstMinMax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreesTest {

    private TreeNode root;

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
    }


    @Test
    public void MinimalTreeFromArray() {
        System.out.println("=========Test1 MinimalTreeFromArray=========");
        int[] minimalTreeArray = new int[]{2, 4, 6, 8, 12, 24, 35, 46};
        TreeNode minimalTree = MinimalTreeFromArray.createMinimalBst(minimalTreeArray);
        System.out.println("Height of the tree is: " + findTreeHeight(minimalTree));
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

    private static void printTreeByLevel(TreeNode root) {
        int height = findTreeHeight(root);
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

    private static int findTreeHeight(TreeNode root) {
        if (root == null) return 0;
        else {
            int leftDepth = findTreeHeight(root.left);
            int rightDepth = findTreeHeight(root.right);
            if (leftDepth > rightDepth) return leftDepth + 1;
            else return rightDepth + 1;
        }
    }
}
