package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReverseList {

    public static LinkedListNode reverseListOther(LinkedListNode head) {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
}