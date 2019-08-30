package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class IsPalindrome {
    public static boolean isPalindrome(LinkedListNode head) {
        LinkedListNode reversed = cloneAndReverse(head);
        return isEqual(head, reversed);
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

    private static boolean isEqual(LinkedListNode l1, LinkedListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.data != l2.data) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}
