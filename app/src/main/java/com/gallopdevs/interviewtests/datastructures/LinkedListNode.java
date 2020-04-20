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

    // Time: O(1)
    public void addFront(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Time: O(n)
    public void addBack(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    // Time: O(1)
    public int getFirst() {
        return head.data;
    }

    // Time: O(n)
    public int getLast() {
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // Time: O(n)
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

    // Time: O(n)
    public LinkedListNode findNodeAtIndex(int index) {
        LinkedListNode current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    // Time: O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // Time: O(1)
    public void clear() {
        head = null;
        size = 0;
    }

    // Time: O(n)
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        LinkedListNode current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    // Time: O(1)
    public int size() {
        return size;
    }

    // Time: O(n)
    public static void print(LinkedListNode node) {
        LinkedListNode current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
