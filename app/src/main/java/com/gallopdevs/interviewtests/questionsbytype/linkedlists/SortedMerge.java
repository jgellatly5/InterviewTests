package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class SortedMerge {
    // Iterative
    // Time: O(n)
    public static LinkedListNode sortedMergeIterative(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode tail = head;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;
        return head.next;
    }

    // Recursive
    // Time: O(n)
    public static LinkedListNode sortedMergeRecursive(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.data < l2.data) {
            l1.next = sortedMergeRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = sortedMergeRecursive(l1, l2.next);
            return l2;
        }
    }
}
