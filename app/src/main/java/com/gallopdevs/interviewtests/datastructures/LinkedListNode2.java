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

    //addFront
    public void addFront(int data) {
        LinkedListNode2 newNode = new LinkedListNode2(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    //addBack
    public void addBack(int data) {
        LinkedListNode2 newNode = new LinkedListNode2(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        LinkedListNode2 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    //getFront
    public int getFront() {
        return head.data;
    }

    //getBack
    public int getLast() {
        LinkedListNode2 current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    //insertAtIndex
    public void insertAtIndex(int index, int data) {
        LinkedListNode2 current = head;
        int i = 0;
        while (i < index - 1 && current.next != null) {
            current = current.next;
            i++;
        }
        LinkedListNode2 temp = current.next;
        current.next = new LinkedListNode2(data);
        current.next.next = temp;
        size++;
    }

    //findNodeAtIndex
    public LinkedListNode2 findNodeAtIndex(int index) {
        LinkedListNode2 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    //delete
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }
        LinkedListNode2 current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    //clear
    //isEmpty
    //size
    //print
}
