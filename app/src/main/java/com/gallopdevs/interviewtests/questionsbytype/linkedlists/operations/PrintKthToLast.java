package com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class PrintKthToLast {
    // Length
    // Time: O(n)
    public static void printKthToLastUsingLength(LinkedListNode head, int k) {
        int length = 0;
        LinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < length - 1 - k; i++) {
            current = current.next;
        }
        System.out.println(k + " from last node is: " + current.data);
    }

    // Pointers
    // Time: O(n)
    public static void printKthToLastPointers(LinkedListNode head, int k) {
        LinkedListNode current = head;
        LinkedListNode follower = head;
        // set current k steps ahead of follower
        for (int i = 0; i < k; i++) {
            if (current == null) return;
            current = current.next;
        }
        // if k is more than the length of the list then return
        if (current == null) return;
        // current and follower should move in sync
        while (current.next != null) {
            current = current.next;
            follower = follower.next;
        }
        // follower will land on the desired node
        System.out.println(k + " from last node is: " + follower.data);
    }

    // Recursive
    // Time: O(n)
    // Space: O(n)
    public static int printKthToLastRecursive(LinkedListNode head, int k) {
        if (head == null) return -1;
        int index = printKthToLastRecursive(head.next, k) + 1;
        if (index == k) System.out.println(k + " from last node is: " + head.data);
        return index;
    }
}
