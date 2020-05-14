package com.gallopdevs.interviewtests.datastructures;

import java.util.EmptyStackException;

public class Stack {
    private static class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    // Time: O(1)
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Time: O(1)
    public int pop() {
        if (head == null) throw new EmptyStackException();
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // Time: O(1)
    public int peek() {
        return head.data;
    }

    // Time: O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // Time: O(1)
    public int size() {
        return size;
    }
}
