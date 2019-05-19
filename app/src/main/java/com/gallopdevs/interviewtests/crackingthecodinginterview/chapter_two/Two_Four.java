package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_two;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

public class Two_Four {

    public static LinkedListNode partition(LinkedListNode node, int value) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while (node != null) {
            LinkedListNode next = node.next;
            node.next = null;
            if (node.data < value) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }

        if (beforeStart == null) {
            print(afterStart);
            return afterStart;
        }
        beforeEnd.next = afterStart;
        print(beforeStart);
        return beforeStart;
    }

    public static void print(LinkedListNode node) {
        LinkedListNode current = node;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
