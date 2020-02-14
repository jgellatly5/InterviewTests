package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class FindLength {
    // iterative
    public static int findLength(LinkedListNode head) {
        int length = 0;
        LinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // recursive
    public static int findLengthRecursive(LinkedListNode node) {
        if (node == null) return 0;
        return findLengthRecursive(node.next) + 1;
    }
}
