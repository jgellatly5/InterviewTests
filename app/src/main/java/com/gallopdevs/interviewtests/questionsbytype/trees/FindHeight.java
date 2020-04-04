package com.gallopdevs.interviewtests.questionsbytype.trees;

import com.gallopdevs.interviewtests.datastructures.TreeNode;

public class FindHeight {
    public static int findHeight(TreeNode node) {
        if (node == null) return 0;
        else {
            int leftHeight = findHeight(node.left);
            int rightHeight = findHeight(node.right);
            if (leftHeight > rightHeight) return leftHeight + 1;
            else return rightHeight + 1;
        }
    }
}
