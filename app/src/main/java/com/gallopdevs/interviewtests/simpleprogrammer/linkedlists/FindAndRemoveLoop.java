package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class FindAndRemoveLoop {
    public static boolean findAndRemoveLoop(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                removeLoop(slow, head);
                return true;
            }
        }
        return false;
    }


    private static void removeLoop(LinkedListNode beginLoop, LinkedListNode head) {
        LinkedListNode pointer1 = beginLoop;
        LinkedListNode pointer2 = beginLoop;

        int k = 1;
        while (pointer1.next != pointer2) {
            pointer1 = pointer1.next;
            k++;
        }

        pointer1 = head;

        pointer2 = head;
        for (int i = 0; i < k; i++) {
            pointer2 = pointer2.next;
        }

        while (pointer2 != pointer1) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        while (pointer2.next != pointer1) {
            pointer2 = pointer2.next;
        }

        pointer2.next = null;
    }
}
