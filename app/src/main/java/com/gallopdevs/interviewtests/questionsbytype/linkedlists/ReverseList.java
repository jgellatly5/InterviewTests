package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReverseList {
    // iterative
    public static LinkedListNode reverseListIterative(LinkedListNode head) {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
    // recursive
    public static void reverseListRecursive(LinkedListNode node) {
        if (node == null) return;
        reverseListRecursive(node.next);
        System.out.print(node.data+ " ");
    }
}
