package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicatesUnsorted {
    // Set
    public static void removeDuplicates(LinkedListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedListNode previous = null;
        LinkedListNode current = head;
        while (current != null) {
            if (hashSet.contains(current.data)) {
                previous.next = current.next;
            } else {
                hashSet.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    // Loops
    public static void removeDuplicatesLoops(LinkedListNode head) {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            previous = current;
            next = current.next;
            // Starting from node directly after current
            while (next != null) {
                // if the value is the same, skip over the node (next)
                if (current.data == next.data) {
                    previous.next = next.next;
                } else {
                    previous = next;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
}
