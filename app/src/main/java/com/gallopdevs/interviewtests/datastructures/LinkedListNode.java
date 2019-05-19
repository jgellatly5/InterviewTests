package com.gallopdevs.interviewtests.datastructures;

public class LinkedListNode {

    public int data;
    public LinkedListNode next;

    public LinkedListNode() {
    }

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public LinkedListNode head;
    private int size;

    public void addFront(int data) {
        LinkedListNode newNode = new LinkedListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addBack(int data) {
        LinkedListNode newNode = new LinkedListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        LinkedListNode current = head;
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
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public void insertAtIndex(int index, int data) {
        LinkedListNode current = head;
        int i = 0;
        while (i < index - 1 && current.next != null) {
            current = current.next;
            i++;
        }
        LinkedListNode temp = current.next;
        current.next = new LinkedListNode(data);
        current.next.next = temp;
        size++;
    }

    public LinkedListNode findNodeAtIndex(int index) {
        LinkedListNode current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        LinkedListNode current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
