package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class RemoveDuplicatesSorted {
    // Iterative
    // Time: O(n^2)
    public static void removeDuplicatesSorted(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode temp = current;
            // starting at current node, place the next pointer at the non duplicate value
            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    // Recursive
    // Time: ?
    public static void removeDuplicatesRecursive(LinkedListNode node) {
        if (node == null || node.next == null) return;
        if (node.data == node.next.data) {
            node.next = node.next.next;
            removeDuplicatesRecursive(node);
        } else {
            removeDuplicatesRecursive(node.next);
        }
    }
}
