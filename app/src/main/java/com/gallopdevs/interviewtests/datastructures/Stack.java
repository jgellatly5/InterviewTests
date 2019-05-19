package com.gallopdevs.interviewtests.datastructures;

import java.util.EmptyStackException;

public class Stack {

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
