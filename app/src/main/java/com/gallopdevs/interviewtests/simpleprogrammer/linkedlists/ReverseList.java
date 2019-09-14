package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReverseList {
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
}
