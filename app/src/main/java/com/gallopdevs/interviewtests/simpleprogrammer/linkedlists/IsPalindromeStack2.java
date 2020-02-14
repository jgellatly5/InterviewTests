package com.gallopdevs.interviewtests.simpleprogrammer.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.Stack;

public class IsPalindromeStack2 {
    public static boolean isPalindromeStack(LinkedListNode head) {
        LinkedListNode fillStack = head;
        Stack<Integer> stack = new Stack<>();
        while (fillStack != null) {
            stack.push(fillStack.data);
            fillStack = fillStack.next;
        }
        LinkedListNode emptyStack = head;
        while (emptyStack != null) {
            int value = stack.pop();
            if (emptyStack.data != value) return false;
            emptyStack = emptyStack.next;
        }
        return true;
    }
}
