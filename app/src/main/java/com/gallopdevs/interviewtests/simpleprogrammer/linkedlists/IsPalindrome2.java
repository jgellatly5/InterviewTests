package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class IsPalindrome2 {

    public static boolean isPalindrome(LinkedListNode head) {
        LinkedListNode reversed = cloneAndReverse(head);
        return isEqual(head, reversed);
    }

    private static boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.data != two.data) return false;
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

    private static LinkedListNode cloneAndReverse(LinkedListNode node) {
        LinkedListNode head = null;
        while (node != null) {
            LinkedListNode clone = new LinkedListNode(node.data);
            clone.next = head;
            head = clone;
            node = node.next;
        }
        return head;
    }
}
