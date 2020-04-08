package com.gallopdevs.interviewtests.datastructures;

public class Queue {
    private static class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Time: O(1)
    public void enqueue(int data) {
        if (head == null) {
            tail = new Node(data);
            head = tail;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
        size++;
    }

    // Time: O(1)
    public int dequeue() {
        if (head == null) throw new IllegalStateException();
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // Time: O(1)
    public int peek() {
        return head.data;
    }

    // Time: O(1)
    public int size() {
        return size;
    }

    // Time: O(1)
    public boolean isEmpty() {
        return head == null;
    }
}
