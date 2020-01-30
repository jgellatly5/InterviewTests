package com.gallopdevs.interviewtests.datastructures;

import java.util.EmptyStackException;

public class Stack2 {
    private static class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    // push
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // pop
    public int pop() {
        if (top == null) throw new EmptyStackException();
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // peek
    public int peek() {
        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }
}
