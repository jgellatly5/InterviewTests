package com.gallopdevs.interviewtests.questionsbytype.recursive;

import java.util.Stack;

public class ReverseStack {
    // Time:
    // insertAtBottom = O(n)
    // reverseStack = O(n) * O(n) = O(n^2)
    // Space:
    // insertAtBottom = O(n)
    // reverseStack = O(n) + O(n) = O(2n) = O(n)

    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return stack;
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
        return stack;
    }

    private static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, x);
        stack.push(temp);
    }
}
