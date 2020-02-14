package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicatesUnsorted2 {
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
