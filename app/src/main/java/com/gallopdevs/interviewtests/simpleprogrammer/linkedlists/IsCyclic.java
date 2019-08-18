package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class IsCyclic {
    // How do you check if a given linked list contains a cycle?
    // How do you find the starting node of the cycle?
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
