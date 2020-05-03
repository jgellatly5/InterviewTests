package com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class DeleteMiddle {
    // Time: O(n)
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
