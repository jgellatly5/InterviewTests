package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class FindLength {
    // How do you find the findLength of a singly linked list?
    public static int findLength(LinkedListNode head) {
        int length = 0;
        LinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
