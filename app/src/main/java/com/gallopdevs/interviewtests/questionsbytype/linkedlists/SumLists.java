package com.gallopdevs.interviewtests.questionsbytype.linkedlists;

import com.gallopdevs.interviewtests.datastructures.LinkedListNode;

import java.util.Stack;

public class SumLists {
    // https://www.ideserve.co.in/  learn/sum-of-two-linked-lists-using-stacks
    // stack
    public static LinkedListNode sumListsStack(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        LinkedListNode current = l1;
        while (current != null) {
            stack1.push(current.data);
            current = current.next;
        }
        current = l2;
        while (current != null) {
            stack2.push(current.data);
            current = current.next;
        }
        int sum = 0;
        int carry = 0;
        int stackValue1 = 0;
        int stackValue2 = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            stackValue1 = stack1.pop();
            stackValue2 = stack2.pop();
            sum = (stackValue1 + stackValue2 + carry) % 10;
            carry = (stackValue1 + stackValue2 + carry) / 10;
            sumStack.push(sum);
        }
        while (!stack1.isEmpty()) {
            stackValue1 = stack1.pop();
            sum = (stackValue1 + carry) % 10;
            carry = (stackValue1 + carry) / 10;
            sumStack.push(sum);
        }
        while (!stack2.isEmpty()) {
            stackValue2 = stack2.pop();
            sum = (stackValue2 + carry) % 10;
            carry = (stackValue2 + carry) / 10;
            sumStack.push(sum);
        }
        if (carry > 0) sumStack.push(carry);
        return createLinkedListFromStack(sumStack);
    }

    public static LinkedListNode head;
    private static LinkedListNode tail;
    private static LinkedListNode createLinkedListFromStack(Stack<Integer> stack) {
        if (head != null) head = null;
        while (!stack.isEmpty()) {
            appendNode(stack.pop());
        }
        return head;
    }

    private static void appendNode(int value) {
        if (head == null) {
            head = new LinkedListNode(value);
            tail = head;
            return;
        }
        LinkedListNode n = new LinkedListNode(value);
        tail.next = n;
        tail = n;
    }

    // recursion
    public static LinkedListNode sumListsRecursively(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;
        LinkedListNode result = new LinkedListNode();
        int value = carry;
        if (l1 != null) value += l1.data;
        if (l2 != null) value += l2.data;
        result.data = value % 10;
        if (l1 != null || l2 != null) {
            result.next = sumListsRecursively(l1 == null ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value >= 10 ? 1 : 0);
        }
        return result;
    }

    //iterative
    public static LinkedListNode sumListsIterative(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummyHead = new LinkedListNode(0);
        LinkedListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new LinkedListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new LinkedListNode(carry);
        }
        return dummyHead.next;
    }
}
