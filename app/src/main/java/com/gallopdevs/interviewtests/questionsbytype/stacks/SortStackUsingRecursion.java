package com.gallopdevs.interviewtests.questionsbytype.stacks;

import java.util.Stack;

public class SortStackUsingRecursion {
    // https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
    public static void sortStack(Stack<Integer> stack) {
        // If stack is not empty
        if (!stack.isEmpty()) {
            // Remove the top item
            int value = stack.pop();
            // Sort remaining stack
            sortStack(stack);
            // Push the top item back in sorted stack
            sortedInsert(stack, value);
        }
    }

    private static void sortedInsert(Stack<Integer> stack, int value) {
        // Base case: Either stack is empty or newly inserted
        // item is greater than top (more than all existing)
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        // If top is greater, remove the top item and recur
        int temp = stack.pop();
        sortedInsert(stack, value);
        // Put back the top item removed earlier
        stack.push(temp);
    }
}
