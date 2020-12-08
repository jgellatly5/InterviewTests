package com.gallopdevs.interviewtests.questionsbytype;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ImplementationPractice {

    @Test
    public void LeetCode() {
        LinkedListNode node = new LinkedListNode(1);
        node.next = new LinkedListNode(0);
        node.next.next = new LinkedListNode(1);

        System.out.println(getDecimalValue(node));
    }

    private int getDecimalValue(LinkedListNode head) {
        int sum = 0;
        int length = 0;
        LinkedListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;
        while (current != null) {
            sum += Math.pow(current.data * 2, --length);
            current = current.next;
        }
        return sum;
    }

    @Test
    public void ArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
//        arrayList.add(0, 7);
//        arrayList.remove(new Integer(10));
        arrayList.add(1, 20);
        arrayList.add(1, 30);
//        System.out.println(arrayList.indexOf(10));

        System.out.println("size: " + arrayList.size());
        for (int i : arrayList) {
            System.out.println("for loop: " + i);
        }

        System.out.println("size: " + arrayList.size());
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }
    }

    @Test
    public void LinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("size: " + linkedList.size());
        for (int i : linkedList) {
            System.out.println("for loop: " + i);
        }

        System.out.println("size: " + linkedList.size());
        Iterator<Integer> iterator = linkedList.iterator();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println("iterator: " + iterator.next());
        }

        while (listIterator.hasNext()) {
            System.out.println("list iterator forwards: " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("list iterator backwards: " + listIterator.previous());
        }
    }
}
