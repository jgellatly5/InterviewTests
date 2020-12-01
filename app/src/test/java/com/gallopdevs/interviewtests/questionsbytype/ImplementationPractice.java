package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;
import com.gallopdevs.interviewtests.projecteuler.SumMultiplesThreeFive;

import org.junit.Test;

import java.util.HashSet;
import java.util.Stack;

public class ImplementationPractice {

    @Test
    public void Practice() {
        LinkedListNode node = new LinkedListNode(2);
        node.next = new LinkedListNode(5);
        node.next.next = new LinkedListNode(6);
        node.next.next.next = new LinkedListNode(8);
        node.next.next.next.next = new LinkedListNode(9);
        node.next.next.next.next.next = new LinkedListNode(9);
        node.next.next.next.next.next.next = new LinkedListNode(10);
        removeDuplicatesSorted(node);
        LinkedListNode.print(node);
    }

    private void removeDuplicatesSorted(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode temp = current;
            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }
}
