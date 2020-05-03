package com.gallopdevs.interviewtests.questionsbytype.linkedlists.operations;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class AppendList {
    // Time: O(n)
    public static LinkedListNode appendList(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode head = l1;
        while (l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2;
        return head;
    }
}
