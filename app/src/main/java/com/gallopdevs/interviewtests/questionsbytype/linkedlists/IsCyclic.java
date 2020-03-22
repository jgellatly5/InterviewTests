package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class IsCyclic {
    // How do you check if a given linked list contains a cycle?
    // How do you find the starting node of the cycle?
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

    // O(n) time, O(n) space
    public static boolean isCyclicSet(LinkedListNode head) {
        HashSet<LinkedListNode> visited = new HashSet<>();
        for (LinkedListNode current = head; current != null; current = current.next) {
            if (visited.contains(current)) return true;
            visited.add(current);
        }
        return false;
    }
}
