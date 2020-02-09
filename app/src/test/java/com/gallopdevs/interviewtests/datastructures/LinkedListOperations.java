package com.gallopdevs.interviewtests.datastructures;

import org.junit.Test;

public class LinkedListOperations {
    // 1. Find middle element of a singly linked list in one pass
    // 2. Reverse linked list w/ recursion
    // 3. Merge two sorted linked lists so they keep the order
    public static LinkedListNode mergeLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode head = l1;
        while (l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2;
        return head;
    }

    @Test
    public void MergeLists() {
        LinkedListNode l1 = new LinkedListNode(2);
        l1.next = new LinkedListNode(3);
        l1.next.next = new LinkedListNode(4);
        LinkedListNode l2 = new LinkedListNode(5);
        l2.next = new LinkedListNode(6);
        l2.next.next = new LinkedListNode(7);
        prettyPrint(mergeLists(l1, l2));
    }

    // 4. Find duplicates in a linked list
    // 5. Add two linked lists using Stack

    private void prettyPrint(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Detect and remove loop from linked list
    // https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/

    // Reverse LinkedList in pairts
    // https://java2blog.com/java-program-to-reverse-linked-list-in/

    // Remove duplicates from a sorted list
    // https://java2blog.com/java-program-to-reverse-linked-list-in/

    // Print Kth Node (variations)
    // https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
}
