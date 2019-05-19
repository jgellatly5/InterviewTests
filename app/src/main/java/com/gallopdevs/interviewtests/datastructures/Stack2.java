package com.gallopdevs.interviewtests.datastructures;

import java.util.EmptyStackException;

public class Stack2 {

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
