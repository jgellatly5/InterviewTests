package com.gallopdevs.interviewtests.questionsbytype;

import org.junit.Test;

import java.util.Stack;

public class ImplementationPractice {

    @Test
    public void Practice() {
        Stack<Integer> test1 = new Stack<>();
        test1.push(4);
        test1.push(3);
        test1.push(2);
        test1.push(1);
        System.out.println(test1);
        reverseStack(test1);
        System.out.println(test1);
    }

    private Stack<Integer> reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return stack;
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
        return stack;
    }

    private void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, x);
        stack.push(temp);
    }
}
