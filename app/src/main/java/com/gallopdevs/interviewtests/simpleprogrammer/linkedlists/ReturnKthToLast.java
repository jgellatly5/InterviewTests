package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReturnKthToLast {

    public static int printKthToLast(LinkedListNode head, int k) {
        if (head == null) return 0;
        int index = printKthToLast(head.next, k) + 1;
        if (index == k) System.out.println(k + " elements from last node is: " + head.data);
        return index;
    }
}
