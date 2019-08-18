package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class IsCyclic2 {
    public static boolean isCyclic(LinkedListNode node) {
        LinkedListNode fast = node.head;
        LinkedListNode slow = node.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
