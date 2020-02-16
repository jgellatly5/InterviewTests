package com.gallopdevs.interviewtests.questionsbytype;

import org.junit.Test;

import java.util.Stack;

public class StackTest {

    // https://algorithms.tutorialhorizon.com/reverse-a-stack-using-recursion-in-place-without-using-extra-memory/
    // 1. Reverse a stack using recursion
    private static void insertAtBottom(Stack<Character> stack, Character c) {
        if (stack.isEmpty()) stack.push(c);
        else {
            Character a = stack.peek();
            stack.pop();
            insertAtBottom(stack, c);
            stack.push(a);
        }
    }

    public static void reverse(Stack<Character> stack) {
        if (stack.size() > 0) {
            Character c = stack.peek();
            stack.pop();
            reverse(stack);
            insertAtBottom(stack, c);
        }
    }

    @Test
    public void StackTest() {
        Stack<Character> stack = new Stack<>();
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');
        System.out.println("Original Stack");
        System.out.println(stack);
        reverse(stack);
        System.out.println("Reversed Stack");
        System.out.println(stack);
    }

    // 2. Sort a stack using recursion
    // 3. Sort a stack using a temporary stack
    // 4. Reverse a stack without using extra space in O(n)
    // 5. Delete middle element of a stack
    // 6. Sorting array using stacks
    // 7. Implement queue using stacks
    // 8. Implement two stacks in an array
    // 9. Implement stack using priority queue / heap

    // https://www.geeksforgeeks.org/stack-data-structure/
    // https://medium.com/@codingfreak/stack-data-structure-practice-problems-and-interview-questions-9f08a35a7f19
}
