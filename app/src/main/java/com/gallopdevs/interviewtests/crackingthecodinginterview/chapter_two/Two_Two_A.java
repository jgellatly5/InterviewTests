package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class Two_Two_A {
    public static int printKthToLast(LinkedListNode head, int k) {
        if (head == null) return 0;
        int index = printKthToLast(head.next, k) + 1;
        if (index == k) System.out.println(k + "th to Last node is " + head.data);
        return index;
    }
}
