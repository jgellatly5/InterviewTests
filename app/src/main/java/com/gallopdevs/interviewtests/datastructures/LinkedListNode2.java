package com.gallopdevs.interviewtests.datastructures;

public class LinkedListNode2 {
    public int data;
    public LinkedListNode2 head;
    public LinkedListNode2 next;
    private int size;

    public LinkedListNode2() {

    }

    public LinkedListNode2(int data) {
        this.data = data;
        this.next = null;
    }

    // addFront
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

    // addBack
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

    // getFirst
    public int getFirst() {
        return head.data;
    }

    // getLast
    public int getLast() {
        LinkedListNode2 current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // insertAtIndex
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

    // findNodeAtIndex
    public LinkedListNode2 findNodeAtIndex(int index) {
        LinkedListNode2 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // clear
    public void clear() {
        head = null;
        size = 0;
    }

    // delete
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
                return;
            }
            current = current.next;
        }
        size--;
    }

    // size
    public int size() {
        return size;
    }

    // print
    public void print() {
        LinkedListNode2 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
