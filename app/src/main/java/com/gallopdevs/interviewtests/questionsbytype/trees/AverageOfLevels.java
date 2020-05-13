package com.gallopdevs.interviewtests.questionsbytype.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static com.gallopdevs.interviewtests.datastructures.BinarySearchTree.*;

public class AverageOfLevels {
    // DFS
    // Time: O(n), n = number of nodes in the tree
    // Space: O(h), h = height of the tree
    public static ArrayList<Double> averageOfLevelsDfs(TreeNode root) {
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        findSums(root, 0, result, count);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / count.get(i));
        }
        return result;
    }

    private static void findSums(TreeNode node, int i,
                                 ArrayList<Double> sum, ArrayList<Integer> count) {
        if (node == null) return;
        if (i < sum.size()) {
            sum.set(i, sum.get(i) + node.data);
            count.set(i, count.get(i) + 1);
        } else {
            sum.add(1.0 * node.data);
            count.add(1);
        }
        findSums(node.left, i + 1, sum, count);
        findSums(node.right, i + 1, sum, count);
    }

    //BFS
    // Time: O(n), n = number of nodes in the tree
    // Space: O(m), m = maximum number of nodes in a level
    public static ArrayList<Double> averageOfLevelsBfs(TreeNode root) {
        ArrayList<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.remove();
                sum += node.data;
                count++;
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            queue = temp;
            result.add(sum * 1.0 / count);
        }
        return result;
    }


}
