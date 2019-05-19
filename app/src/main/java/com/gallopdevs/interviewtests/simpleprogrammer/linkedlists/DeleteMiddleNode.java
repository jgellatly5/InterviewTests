package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class DeleteMiddleNode {

    public static boolean deleteNode(LinkedListNode node) {
        if (node == null || node.next == null) return false;
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }
}
