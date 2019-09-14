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
}
