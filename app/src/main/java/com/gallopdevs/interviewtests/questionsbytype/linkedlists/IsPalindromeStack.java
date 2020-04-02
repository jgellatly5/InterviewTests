package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.Stack;

public class IsPalindromeStack {
    // Time: O(n)
    // Space: O(n)
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
