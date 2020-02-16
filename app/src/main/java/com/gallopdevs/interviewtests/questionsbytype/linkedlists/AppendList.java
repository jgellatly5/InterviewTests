package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class AppendList {
    public static LinkedListNode appendList(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode head = l1;
        while (l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2;
        return head;
    }
}