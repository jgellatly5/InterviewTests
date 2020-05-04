package com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
    // Loops
    // Fix
    public static void findDuplicatesLoops(LinkedListNode head) {
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            next = current.next;
            while (next != null) {
                if (current.data == next.data) {
                    System.out.print(current.data + " ");
                }
                next = next.next;
            }
            current = current.next;
        }
        System.out.println();
    }
    // Set
    // Time: O(n)
    // Space: O(n)
    public static void findDuplicatesSet(LinkedListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedListNode current = head;
        while (current != null) {
            if (!hashSet.add(current.data)) {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }
    // Count
    // Time: O(n)
    // Space: O(n)
    public static void findDuplicatesCount(LinkedListNode head) {
        HashMap<Integer, Integer> numAndCount = new HashMap<>();
        LinkedListNode current = head;
        while (current != null) {
            Integer count = numAndCount.get(current.data);
            if (count == null) {
                numAndCount.put(current.data, 1);
            } else {
                numAndCount.put(current.data, ++count);
            }
            current = current.next;
        }
        Set<Map.Entry<Integer, Integer>> entrySet = numAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey() + ", count: " + entry.getValue());
            }
        }
    }
}
