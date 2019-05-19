package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class Two_Seven_A {

    public static LinkedListNode findIntersection(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null || l2 == null) return null;
        Result result1 = getTailAndSize(l1);
        Result result2 = getTailAndSize(l2);
        if (result1.tail != result2.tail) return null;
        LinkedListNode shorter = result1.size < result2.size ? l1 : l2;
        LinkedListNode longer = result1.size < result2.size ? l2 : l1;
        longer = getKthNode(longer, Math.abs(result1.size - result2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    private static LinkedListNode getKthNode(LinkedListNode head, int k) {
        LinkedListNode current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    private static Result getTailAndSize(LinkedListNode list) {
        if (list == null) return null;
        int size = 1;
        LinkedListNode current = list;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return new Result(current, size);
    }

    private static class Result {
        public LinkedListNode tail;
        public int size;
        public Result(LinkedListNode tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }
}
