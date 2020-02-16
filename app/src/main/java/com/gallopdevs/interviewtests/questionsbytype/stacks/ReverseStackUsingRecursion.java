package com.gallopdevs.interviewtests.questionsbytype.stacks;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    // https://algorithms.tutorialhorizon.com/reverse-a-stack-using-recursion-in-place-without-using-extra-memory/
    public static void reverse(Stack<Character> stack) {
        if (stack.size() > 0) {
            Character c = stack.peek();
            stack.pop();
            reverse(stack);
            insertAtBottom(stack, c);
        }
    }

    private static void insertAtBottom(Stack<Character> stack, Character c) {
        if (stack.isEmpty()) stack.push(c);
        else {
            Character a = stack.peek();
            stack.pop();
            insertAtBottom(stack, c);
            stack.push(a);
        }
    }
}
