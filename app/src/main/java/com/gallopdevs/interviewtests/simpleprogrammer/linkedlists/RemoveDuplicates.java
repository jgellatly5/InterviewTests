package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicates {
    // How are duplicate nodes removed in an unsorted linked list?
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
            while (next != null) {
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
