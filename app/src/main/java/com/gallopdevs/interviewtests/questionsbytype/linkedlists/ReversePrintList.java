package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReversePrintList {
    public static void reversePrintList(LinkedListNode node) {
        if (node.next != null) reversePrintList(node.next);
        System.out.println(node.data);
    }
}
