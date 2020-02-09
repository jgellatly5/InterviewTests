package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class IsCyclic2 {
    public static boolean isCyclic(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public static boolean isCylicHash(LinkedListNode node) {
        HashSet<LinkedListNode> hashSet = new HashSet<>();
        while (node != null) {
            if (hashSet.contains(node)) return true;
            hashSet.add(node);
            node = node.next;
        }
        return false;
    }
}
