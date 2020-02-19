package com.gallopdevs.interviewtests.datastructures;

public class Queue {
    public static class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

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

    public int dequeue() {
        if (head == null) throw new IllegalStateException();
        else {
            int value = head.data;
            head = head.next;
            size--;
            return value;
        }
    }

    public int peek() {
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
