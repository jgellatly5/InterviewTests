package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import org.junit.Before;
import org.junit.Test;

public class Practice {

    private LinkedListNode node;
    private LinkedListNode node2;
    private LinkedListNode node3;
    private LinkedListNode cyclicList;
    private LinkedListNode l1;
    private LinkedListNode l2;
    private LinkedListNode nodePalindrome;
    private LinkedListNode nodePalindrome2;
    private LinkedListNode nodeIntersection;
    private LinkedListNode nodeIntersection2;
    private LinkedListNode nodeSorted;

    @Before
    public void setUp() throws Exception {
        node = new LinkedListNode(5);
        node.next = new LinkedListNode(1);
        node.next.next = new LinkedListNode(3);
        node.next.next.next = new LinkedListNode(7);
        node.next.next.next.next = new LinkedListNode(10);
        node.next.next.next.next.next = new LinkedListNode(10);
        node.next.next.next.next.next.next = new LinkedListNode(11);
        node.next.next.next.next.next.next.next = new LinkedListNode(11);

        node2 = new LinkedListNode(5);
        node2.next = new LinkedListNode(1);
        node2.next.next = new LinkedListNode(3);
        node2.next.next.next = new LinkedListNode(7);
        node2.next.next.next.next = new LinkedListNode(10);
        node2.next.next.next.next.next = new LinkedListNode(10);
        node2.next.next.next.next.next.next = new LinkedListNode(11);
        node2.next.next.next.next.next.next.next = new LinkedListNode(11);

        node3 = new LinkedListNode(5);
        node3.next = new LinkedListNode(1);
        node3.next.next = new LinkedListNode(3);
        node3.next.next.next = new LinkedListNode(7);
        node3.next.next.next.next = new LinkedListNode(10);
        node3.next.next.next.next.next = new LinkedListNode(10);
        node3.next.next.next.next.next.next = new LinkedListNode(11);
        node3.next.next.next.next.next.next.next = new LinkedListNode(11);

        cyclicList = new LinkedListNode(4);
        cyclicList.next = new LinkedListNode(1);
        cyclicList.next.next = new LinkedListNode(3);
        cyclicList.next.next.next = new LinkedListNode(7);
        cyclicList.next.next.next.next = cyclicList;

        l1 = new LinkedListNode(6);
        l1.next = new LinkedListNode(7);
        l1.next.next = new LinkedListNode(8);

        l2 = new LinkedListNode(4);
        l2.next = new LinkedListNode(3);
        l2.next.next = new LinkedListNode(2);

        nodePalindrome = new LinkedListNode(6);
        nodePalindrome.next = new LinkedListNode(1);
        nodePalindrome.next.next = new LinkedListNode(2);
        nodePalindrome.next.next.next = new LinkedListNode(1);
        nodePalindrome.next.next.next.next = new LinkedListNode(6);

        nodePalindrome2 = new LinkedListNode(6);
        nodePalindrome2.next = new LinkedListNode(1);
        nodePalindrome2.next.next = new LinkedListNode(2);
        nodePalindrome2.next.next.next = new LinkedListNode(1);
        nodePalindrome2.next.next.next.next = new LinkedListNode(6);

        nodeIntersection = new LinkedListNode(7);
        nodeIntersection.next = new LinkedListNode(6);
        nodeIntersection.next.next = new LinkedListNode(1);
        nodeIntersection.next.next.next = new LinkedListNode(4);

        nodeIntersection2 = new LinkedListNode(5);
        nodeIntersection2.next = nodeIntersection.next;

        nodeSorted = new LinkedListNode(1);
        nodeSorted.next = new LinkedListNode(1);
        nodeSorted.next.next = new LinkedListNode(2);
        nodeSorted.next.next.next = new LinkedListNode(2);
        nodeSorted.next.next.next.next = new LinkedListNode(2);
        nodeSorted.next.next.next.next.next = new LinkedListNode(3);
    }

    @Test
    public void PracticeTest() {
        System.out.println("\n=========Delete Middle=========");
        prettyPrint(node2);
        deleteMiddle(node2);
        prettyPrint(node2);
        prettyPrint(nodePalindrome2);
        deleteMiddle(nodePalindrome2);
        prettyPrint(nodePalindrome2);
    }

    private void prettyPrint(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    private void deleteMiddle(LinkedListNode head) {
        if (head == null || head.next == null) return;
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        LinkedListNode previous = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }
        previous.next = slow.next;
    }
}
