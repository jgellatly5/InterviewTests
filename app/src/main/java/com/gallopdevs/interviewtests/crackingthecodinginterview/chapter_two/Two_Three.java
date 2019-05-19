package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class Two_Three {

    public static boolean deleteMiddleNode(LinkedListNode node) {
        if (node == null || node.next == null) return false;
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }
}
