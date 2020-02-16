package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class FindMiddle {
    public static int findMiddle(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
