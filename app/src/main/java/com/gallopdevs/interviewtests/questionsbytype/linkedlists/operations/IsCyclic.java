package com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class IsCyclic {
    // Time: O(n)
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

    // Time: O(n)
    // Space: O(n)
    public static boolean isCyclicSet(LinkedListNode head) {
        HashSet<LinkedListNode> visited = new HashSet<>();
        LinkedListNode current = head;
        while (current != null) {
            if (visited.contains(current)) return true;
            visited.add(current);
            current = current.next;
        }
        return false;
    }
}
