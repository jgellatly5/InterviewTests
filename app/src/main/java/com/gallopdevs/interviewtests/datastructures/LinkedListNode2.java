package com.gallopdevs.interviewtests.datastructures;

public class LinkedListNode2 {

    public int data;
    public LinkedListNode2 next;

    public LinkedListNode2(int data) {
        this.data = data;
        this.next = null;
    }

    public LinkedListNode2 head;
    private int size;

    public void addFront(int data) {
        LinkedListNode2 newNode = new LinkedListNode2(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addBack(int data) {
        LinkedListNode2 newNode = new LinkedListNode2(data);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkedListNode2 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        LinkedListNode2 current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }
        LinkedListNode2 current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        size--;
    }

    public void clear() {
        head = null;
    }

    public int size() {
        return size;
    }

}
