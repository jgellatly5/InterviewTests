package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReverseList {
    // Iterative
    // Time: O(n)
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
}
