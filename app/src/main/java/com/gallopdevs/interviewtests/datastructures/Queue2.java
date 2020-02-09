package com.gallopdevs.interviewtests.datastructures;

public class Queue2 {
    private static class Node {
        private int data;
        private Node next;
        Node (int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public int dequeue() {
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }
}
