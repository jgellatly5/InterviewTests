package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicates2 {
    public static void removeDuplicates(LinkedListNode head) {
        HashSet<Integer> set = new HashSet();
        LinkedListNode current = head;
        LinkedListNode previous = null;
        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }

            current = current.next;
        }
    }
}
