package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class FindAndRemoveLoop {
    // Floyd's algorithm
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


    private static void removeLoop(LinkedListNode nodeInLoop, LinkedListNode head) {
        LinkedListNode pointer1 = nodeInLoop;
        LinkedListNode pointer2 = nodeInLoop;

        // count the number of nodes in the loop
        int k = 1;
        while (pointer1.next != pointer2) {
            pointer1 = pointer1.next;
            k++;
        }

        // fix one pointer to the head
        pointer1 = head;

        // fix the other pointer to k nodes after the head
        pointer2 = head;
        for (int i = 0; i < k; i++) {
            pointer2 = pointer2.next;
        }

        // move pointers at same place and they will end where the loop begins
        while (pointer2 != pointer1) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        // find the last node of the loop
        while (pointer2.next != pointer1) {
            pointer2 = pointer2.next;
        }

        // dequeue the next pointer to the node causing the loop
        pointer2.next = null;
    }
}
