package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReversePairs {
    // https://java2blog.com/java-program-to-reverse-linked-list-in/
    // Iteratively
    public static LinkedListNode reversePairs(LinkedListNode head) {
        LinkedListNode current = head;
        LinkedListNode temp = null;
        LinkedListNode newHead = null;
        while (current != null && current.next != null) {
            if (temp != null) {
                temp.next.next = current.next;
            }
            temp = current.next;
            current.next = temp.next;
            temp.next = current;
            if (newHead == null) {
                newHead = temp;
            }
            current = current.next;
        }
        return newHead;
    }

    // Recursive
    public static LinkedListNode reversePairsRecursive(LinkedListNode node) {
        if (node == null || node.next == null) return node;
        LinkedListNode temp = node.next;
        node.next = temp.next;
        temp.next = node;
        node.next = reversePairsRecursive(node.next);
        return temp;
    }
}
