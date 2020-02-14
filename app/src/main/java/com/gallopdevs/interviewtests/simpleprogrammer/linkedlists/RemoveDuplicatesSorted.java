package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class RemoveDuplicatesSorted {
    // iterative
    public static void removeDuplicatesSorted(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode temp = current;
            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    // recursive
    public static void removeDuplicatesRecursive(LinkedListNode head) {
        if (head == null || head.next == null) return;
        if (head.data == head.next.data) {
            head.next = head.next.next;
            removeDuplicatesRecursive(head);
        } else {
            removeDuplicatesRecursive(head.next);
        }
    }
}
