package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReverseList2 {
    public static LinkedListNode reverseList(LinkedListNode head) {
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
    public static LinkedListNode reverseListRecursive(LinkedListNode head) {
        if (head == null || head.next == null) return head;
        LinkedListNode newNode = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}
