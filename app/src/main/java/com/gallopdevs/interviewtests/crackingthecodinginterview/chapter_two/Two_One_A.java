package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashSet;

public class Two_One_A {

    public static void removeDuplicates(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<>();
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
