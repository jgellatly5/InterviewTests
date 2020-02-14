package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class DeleteMiddle {
    public static void deleteMiddle(LinkedListNode head) {
        if (head == null || head.next == null) return;
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        LinkedListNode previous = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }
        previous.next = slow.next;
    }
}
