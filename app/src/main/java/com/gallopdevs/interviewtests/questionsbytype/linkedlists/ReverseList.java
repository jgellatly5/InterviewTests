package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class ReverseList {
    // Iterative
    // Time: O(n)
    public static LinkedListNode reverseListIterative(LinkedListNode head) {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}

//                                           p            c
// null <- [] [1]    <- [] [2]  <-[][3]   <- []    [4]    [5]  [] -> null
//                                                        n